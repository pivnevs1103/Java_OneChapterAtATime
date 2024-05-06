package Polymorphism;

/* this is used to go over the other main method, to break everything down
 */
public class NextMain {
    public static void main(String[] args) {

        /**********************************************************************
         * NOTE: THIS IS COPIED FROM The other MAIN CLASS AND JUST BREAKS IT DOWN... LINE 20 AND 21
         - First we are creating a variable with the Movie type and we've called it a movie
         - We then assigned the result of this static method, Movie.getMovie to that variable
         **********************************************************************/
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // This is an error because while as humans we can see that since we typed in the letter 'A', it will return an
        // adventure class but the compiler doesnt know that and it assumes in this case it could be either, comedy,
        // adventure, or science fiction
        // CODE: Adventure jaws = Movie.getMovie("A", "Jaws");

        // INSTEAD DO THIS ... However if you type anything but 'A' in there you will get an error
        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        // Because Object doesnt have the specific methods that these classes have you would have to cast them
        // in order to make them work
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        // Var is a special contextual keyword in Java, that lets our code take advantage of Local Variable Type
        // Inference. By using the var as the type, we are telling java to figure out the compile-time type for us
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        /*
        Run time Vs. Compile time Typing
        - Compile time - (Method Overloading)think of it as a declared type, this type is declared either as a variable reference,
        or a method return type, or a method parameter for example
        - Run time - (Method Overriding)
         */

        /**************************************************************************************************************
                                    TESTING THE RUNTYPE USING THE instanceof OPERATOR
        **************************************************************************************************************/

        Object unknownObject = Movie.getMovie("S", "Jaws");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            // The reason to cast comedy here is, we want to execute the method that's specific to comedy, 'watchComedy'
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();

            // The instanceof operator, lets you test the type of an object or instance
            // The reference variable you are testing is the left operand (unknownObject in this case)
            // The type you are testing for, is the right operand
            // NOTE: See that the Adventure is not in quotes , meaning we are not testig the type name, but the actual type
            // This operator returns true, if unknownObject is an instance of Adventure
        }else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();

            // Another way of doing this called : Pattern Matching
            // For this operator, the object can be assigned to a binding variable, which here is called syfy
            // The variable syfy(if the instance method returns true) is already typed as a ScienceFiction variable
        }else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}

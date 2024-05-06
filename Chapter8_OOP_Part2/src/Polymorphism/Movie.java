package Polymorphism;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        // .getClass() is on java linked object class, this method returns class type information about the runtime
        // instance on which this method is executing
        // And from that we can get the name of the class using the .getSimpleName() method
        // This will print out the class which will be moving if we execute this method on a runtime movie object
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    // In this code, the parameters of this method are the type of the movie and the title.
    // we are going to return an instance of the movie class, or a subclass of a movie
    // This method that returns a new instance object, is known as a factory method
    // Factory methods give us a way to get an object without having to know the details of how to create a new on
    // or specify the exact class we want
    public static Movie getMovie(String type, String title){

        // Taking whatever was passed to us, making it upperCase then just getting the first letter
        // In our case, each of our subclasses has a unique letter for its class name, so we can use that
        // to figure iut the right kind of movie to create
        // !!! We initiate the classes here based on what type of movie it is using the case and then returning it
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watch an Adventure!");
    }
}

class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watch a Comedy, that's funny!");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }

    public void watchScienceFiction(){
        System.out.println("Watch a Science Fiction Thriller!");
    }
}





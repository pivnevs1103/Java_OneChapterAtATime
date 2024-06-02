package InterfaceChallengeMySolution;

import java.util.Map;

public interface Mappable {

    // Initializing the variable
    String JSON_PROPERTY = "\"properties\": {%s}";

    // This method gets called by the reference variable which prints out all the info
    static void mapIt(Mappable mappable){
        System.out.printf(JSON_PROPERTY, mappable.toJson());
        System.out.println();
        System.out.println("Type \"stop\" to exit the program");
    }

    // Just a default method that gets overridden by classes
    default String toJson(){
        System.out.println("You should override this string");
        return null;
    }

    // Abstract methods, that get implemented by classes
    String getLabel();
    String getMarker();
    Geometry getShape();
}

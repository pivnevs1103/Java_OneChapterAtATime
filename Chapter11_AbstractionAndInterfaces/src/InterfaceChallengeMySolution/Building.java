package InterfaceChallengeMySolution;

import java.util.Random;
import java.util.concurrent.Callable;

public class Building implements Mappable{
    // Declaring variables
    String name;
    BuildingType type = BuildingType.BUSINESS;

    // Constructor that takes in the name and initializes the class
    public Building(String name){
        this.name = name;
    }

    // This is a default method on the interface that gets called to print out the info
    @Override
    public String toJson() {
        return "\"type\": \"" + getShape() + "\", " + getLabel() + " " + getMarker() + ", \"name\": \"" + name + "\", "
                + "\"usage\": \"" + type + "\"";
    }

    // prints the label info by making the user select the type
    @Override
    public String getLabel() {
        return "\"label\": \"" + name + " (" + type.choosingTheType() + ")\", ";
    }

    // prints out the marker info and chooses the color from the enum class "Color"
    @Override
    public String getMarker() {
        // Creates a variable of the enum object
        Color color = Color.RED;
        return "\"marker\": " + "\"" + color.choosingColor() + " STAR\"";
    }

    // Returns the geometry type by passing this instance if the class
    @Override
    public Geometry getShape() {
        Geometry type = Geometry.LINE;
        return type.getType(this);
    }
}

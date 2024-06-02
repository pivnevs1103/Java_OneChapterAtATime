package InterfaceChallengeMySolution;

import java.util.Random;

public class UtilityLine implements Mappable{

    // Declaring variables
    String name;
    UtilityType type = UtilityType.ELECTRICAL;

    // Constructor that takes in the name and initializes the class
    public UtilityLine(String name){
        this.name = name;
    }

    // This is a default method on the interface that gets called to print out the information
    @Override
    public String toJson() {
        return "\"type\": \"" + getShape() + "\", " + getLabel() + " " + getMarker();
    }

    // prints the label info by making the user select the type
    @Override
    public String getLabel() {
        return "\"label\": \"" + name + " (" + type.choosingTheType() + ")\", ";
    }

    // prints out the marker info and chooses the color from the enum class "Color"
    @Override
    public String getMarker() {
        Color color = Color.RED;
        return "\"marker\": " + "\"" + color.choosingColor() + " Dotted Line\"";
    }

    // Returns the geometry type by passing this instance if the class
    @Override
    public Geometry getShape() {
        Geometry type = Geometry.LINE;
        return type.getType(this);
    }
}

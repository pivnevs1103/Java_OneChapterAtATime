package InterfaceChallenge_ProfessorSolution;

import InterfaceChallengeMySolution.Color;
import InterfaceChallengeMySolution.Geometry;

import javax.crypto.DecapsulateException;

enum UsageType{
    ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS
}

public class Building implements Mappable{

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage){
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> ColorEnum.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> ColorEnum.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> ColorEnum.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> ColorEnum.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> ColorEnum.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public GeometryEnum getShape() {
        return GeometryEnum.POINT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                ", name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}

package InterfaceChallenge_ProfessorSolution;

enum UtilityTYpe{
    ELECTRICAL,
    FIBER_OPTIC,
    GAS,
    WATER
}

public class UtilityLIne implements Mappable{

    private String name;
    private UtilityTYpe type;

    public UtilityLIne(String name, UtilityTYpe type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> ColorEnum.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> ColorEnum.GREEN + " " + LineMarker.DOTTED;
            case GAS -> ColorEnum.ORANGE + " " + LineMarker.SOLID;
            case WATER -> ColorEnum.BLACK + " " + LineMarker.SOLID;
            default -> ColorEnum.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public GeometryEnum getShape() {
        return GeometryEnum.LINE;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                ", name": "%s", "utility": "%s" """.formatted(name, type);
    }
}

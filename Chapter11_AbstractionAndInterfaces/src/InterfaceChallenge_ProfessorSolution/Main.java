package InterfaceChallenge_ProfessorSolution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLIne("College St", UtilityTYpe.FIBER_OPTIC));
        mappables.add(new UtilityLIne("Olympic Blvd", UtilityTYpe.WATER));

        for(var m :mappables){
            Mappable.mapIt(m);
        }
    }
}

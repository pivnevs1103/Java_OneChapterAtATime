public class Challenge_MinutesToYearsAndDaysCalculator {
    public static void main(String[] args){

        printYearsAndDays(1788480);
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int hours = (int)minutes / 60;
            int days = (int)hours / 24;
            int daysRem = (hours / 24) % 365;
            int years = days / 365;

            System.out.println(minutes + " min = " + years + " y and " +
                    daysRem + " d" );

        }
    }
}

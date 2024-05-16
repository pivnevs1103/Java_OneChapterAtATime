package EnumType;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Declaring a variable and assigning the Label TUES to it
        Enum_DayOfTheWeek weekDay = Enum_DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for(int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            // First we print out the label, and secondly we get the ordinal value(order) of this constant
            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

            if(weekDay == Enum_DayOfTheWeek.FRI){
                System.out.println("Found a Friday!!!");
            }
        }
        System.out.println("-".repeat(30));

        for(int i = 0; i < 5; i++){
            weekDay = getRandomDay();
            switchDayOfWeek(weekDay);
        }
        System.out.println("-".repeat(30));

        // LOOPING through the enum type
        for(Topping toppings : Topping.values()){
            System.out.println(toppings.name() + " : $" + toppings.getPrice());
        }
    }

    public static Enum_DayOfTheWeek getRandomDay(){
        // Getting a random integer
        int randomInteger = new Random().nextInt(7);
        // Creating an array and .values() method returns ab array of all the enum constant values
        var allDays = Enum_DayOfTheWeek.values();

        // Returns the result of the above method, by returning A constant value in the array which was chosen
        // randomly
        return allDays[randomInteger];
    }

    // Using a switch statement this method, prints out the full name of the day of the week, and the number of the day
    // of the week I expect... Meaning SUN should print out as Day 1, not Day 0
    public static void switchDayOfWeek(Enum_DayOfTheWeek weekDay){

        int weekDayInteger = weekDay.ordinal() + 1;
        // You can use the switch statement using the enum type itself, in the switch expression
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day "  + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day "  + weekDayInteger);
            // This code makes the first letter Capital, and then makes the rest of it lowecase and then adds the last
            // part to it "day".
            // Example: 'FRI' -> F remains capital, 'ri' becomes lowercase and 'day' gets added last. SO fri -> Friday
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);

        }
    }
}

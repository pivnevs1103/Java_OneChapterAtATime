package Learning_Records;
/*
        Yes just this one line below does everything that the EmployeeClass does and more!
        " public record EmployeeRecord(String name, int employeeID){}

        Record Info:
          - Special type of class that's why you say 'public record'
          - Java automatically generates private and final fields for the components(in this case: 'name' and
            'employeeID' you are passing
          - Also generates public getter methods for each component
          - Will generate a constructor with those parameters
          - Will generate implementations of the 'toString', 'equals', and 'hashCode' methods
          - You are allowed to Override any method with implementations of your own.
          - Does NOT generate setter methods
          - The MAIN reason to use the record because they are immutable by default, which means that a record
            object cannot be changed once its created
          - Just like any other class you can call and create your own instance and static methods
          - You are allowed to create static field BUT you are NOT allowed to define non-static instance field
          - Records cannot extend any other class and because record is Final no other class can extend it
          - You can implement interfaces
          - Even though Java gives you a constructor, you CAN Override it with your own implementation
 */

public record EmployeeRecord (String name, int employeeID){

    // Allowed
    private static final String placeOfWork = "Office";

    // NOT ALLOWED
    // public String age;

    // Compact constructor, notice how we dont have any parameters, this is used in the case that you want some
    // sort of validation
    public EmployeeRecord{
        if(employeeID < 0){
            throw new IllegalArgumentException("Employee Number cannot be negative");
        }
    }

    // Adding an instance method
    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    // Adding a static method
    public static void printWhatever(){
        System.out.println("Whatever");
    }
}

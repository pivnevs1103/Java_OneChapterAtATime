package EnumType;

public enum Topping {
    /*
        - Underneath, its really just a class, and each of the constants is an instance of that class.
        - We can add fields, methods and even constructors to the enum type
        - Before you add any methods or code, you have to include a semi-colon after the list of values
     */

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    // This returns a price for each different topping
    public double getPrice(){

        return switch (this){
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }

    /*
           - Another option to the code above would be to create a field on this enum, called price, and use
           constructors for each label
     */

}

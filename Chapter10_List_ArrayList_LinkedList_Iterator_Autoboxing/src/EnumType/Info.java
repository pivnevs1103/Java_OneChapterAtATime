package EnumType;

public class Info {

    /*
        Enumeration:
        - The enum type is Java's type to support something called an enumeration
        - enumeration: A complete ordered listing of all the items in a collection
        - Java describes it as: A special data type that contains predefined constants
        - A constant is a variable whose value cant be changed, once its value has been assigned
        - SO an enum is a little like an array, excepts its elements are known, not changeable, and each element can
        be referred to by a constant name, instead of an index position
        - Enum also start at 0, just like arrays and arrayLists

        DECLARING:
        public enum DayOfTheWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

        - an enum, in its simplest form, is described like a class, but the keyword enum, replaces the keyword class
        - You can name the enum with any valid identifier, but like a class, Upper CamelCase is the preferred style
        - Within the enum body, you declare a list of constant identifiers, separated by commas. By convention, these
        are all uppercase labels.
        - An enum is ordered, by the way you declare the constants.
        - In the above example, it means that SUNDAY is considered first day of the week, and SATURDAY is the last
        - The enum type is used to declare a limited set of constants, and sometimes, there is a natural order to the
        listing, as in the example above
        - Some other examples of possible enum declarations might be:
            - The months in a year: JANUARY, FEBRUARY, MARCH, etc,,
            - The directions in a compass: EAST, NORTH, WEST, SOUTH
            - A set of sizes: EXTRA_SMALL, SMALL, MEDIUM, LARGE

        - Underneath the covers, the enum type is a special type of class, which contains fields to support the
        constants

        WHEN CREATING ENUM -> make sure to select create new Java class and MAKE SURE to select ENUM type!!!
     */
}

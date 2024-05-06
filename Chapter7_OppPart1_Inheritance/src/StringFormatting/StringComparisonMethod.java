package StringFormatting;

public class StringComparisonMethod {
    public static void main(String[] args) {

        String helloWorld = "Hello World";
        String helloWorldLower = helloWorld.toLowerCase();

        // Sees if those two variables above match each other
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        // Does the same thing as above but ignores wether the letters are capital or not
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }
        // sees if the string starts with this
        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        // Sees if the string ends with this
        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        // Sees if the string contains this
        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }

    }
}

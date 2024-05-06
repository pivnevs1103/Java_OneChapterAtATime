public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible;

    // Creating a basic constructor, if you dont create this java does it automatically for you
    public Car(){
        // Using this keyword I can call another consturctor, it just has to be the first statement
        this("Ferrari", "LaFerrari", "red", 2,true);
        System.out.println("Empty Constructor Called");
    }

    // Created another constructor, this is called constructor overloading
    public Car(String model, String make, String color,
                    int doors, Boolean convertible){
        System.out.println("This is the constructor with parameters");
        this.model = model;
        this.make = make;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // With the set methods you can set up rules, related to the class, what is valid and what is not
    // So like validation, this would make sure that people cant created invalid objects
    public void setMake(String make){
        if(make == null)
            make = "Unknown";

        String lowerCaseMake = make.toLowerCase();
        switch(lowerCaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Doors " +
                color + " " +
                make  + " " +
                model + " " +
                (convertible? "Convertible" : "Not Convertible"));
    }
}

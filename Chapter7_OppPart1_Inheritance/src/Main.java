// Encapsulation, the practice of hiding fields and some methods from public access.
public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        // Calling the constructor
        // Car car = new Car("Porsche", "911", "blue", 2,true);

        // car.setColor("Grey");
        // car.setConvertible(true);
        // car.setDoors(2);
        // car.setMake("Porsche");
        // car.setModel("911");
        // car.describeCar();

        Car targa = new Car();
        targa.setColor("Red");
        targa.setConvertible(false);
        targa.setDoors(4);
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.describeCar();
    }
}
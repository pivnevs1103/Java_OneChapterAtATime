package Inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;


    public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Big"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void makeNoise(){
        if(type.equals("Wolf")){
            System.out.println("Ow Woooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag with their tail");
        if(speed.equals("slow")){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog Running! ");
    }

    private void walk(){
        System.out.println("Dog walking! ");
    }
    private void wagTail(){
        System.out.println("Dog wagging tail! ");
    }

}

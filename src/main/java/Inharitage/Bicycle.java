package Inharitage;

public class Bicycle extends Vehicle2 implements Vechicle,Bicycle2 {

    private Color color;

    public Bicycle(String model, String brand, int year, Color color) {
        super(model, brand, year);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void myBike(){
        System.out.println("My bike"+ this.brand + this.model + this.model + this.color);
    }


    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void start(String bike) {
        System.out.println("I got on the " + bike + "bike and road");

    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public void move() {
        System.out.println("Bike moving");
    }


    @Override
    public void breake() {

            System.out.println("My Bike is broken");

    }
}

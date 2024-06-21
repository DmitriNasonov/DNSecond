package Inharitage;

public class Car extends Vehicle2 implements Vechicle {
    private Color color;

    public Car(String model, String brand, int year, Color color){
        super(model, brand, year);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void total(){
//        System.out.println("This Vehicle is "+ getBrand() + getModel() + getYear() + this.color);
        System.out.println("This Vehicle is "+ this.brand + this.model + this.year + this.color);
    }
    @Override
    public void start(){
        System.out.println("Car start");
    }
    @Override
    public void start(String car){
        System.out.println(car + " started");
    }
    @Override
    public void  stop(){
        System.out.println("Car stopped");
    }
    @Override
    public void move(){
        System.out.println("Car moved");
    }
}

package Inharitage;

public class Vehicle2 {
    protected String model;
    protected String brand;
    protected int year;

    public Vehicle2(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void inf(){
        System.out.println("This Vehicle is"+this.brand + this.model + this.year);
    }
}

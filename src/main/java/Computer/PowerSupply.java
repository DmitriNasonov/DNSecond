package Computer;

public class PowerSupply {

    private String model;

    private String brand;

    private int power;

    public PowerSupply(String model, String brand, int power) {
        this.model = model;
        this.brand = brand;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

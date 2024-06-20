package Computer;

public class CPU {
    private String model;
    private String brand;
    private int ghz;

    public CPU(String model, String brand, int ghz) {
        this.model = model;
        this.brand = brand;
        this.ghz = ghz;
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

    public int getGhz() {
        return ghz;
    }

    public void setGhz(int ghz) {
        this.ghz = ghz;
    }
}

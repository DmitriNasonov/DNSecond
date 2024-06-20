package Computer;

public class MotherBoard {
    private String model;
    private String brand;
    private CPU cpu;
    private Ram[] ram;

    public MotherBoard(String model, String brand, CPU cpu, Ram[] ram) {
        this.model = model;
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
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

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Ram[] getRam() {
        return ram;
    }

    public void setRam(Ram[] ram) {
        this.ram = ram;
    }
}

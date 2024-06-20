package Computer;

public class Keyboard {
    private String model;

    private String brand;

    private Color color;

    public Keyboard(String model, String brand, Color color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

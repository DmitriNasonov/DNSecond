package Computer;

public class Mouse {

    private String model;

    private String brand;

    private String sensorType;
    private String connectionType;

    public Mouse(String model, String brand, String sensorType, String connectionType) {
        this.model = model;
        this.brand = brand;
        this.sensorType = sensorType;
        this.connectionType = connectionType;
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

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
}

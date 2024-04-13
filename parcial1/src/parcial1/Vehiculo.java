package parcial1;
public class Vehiculo {

    private String plate;
    private String description;
    private String driverName;
    private String route;
    private String brand;
    private String model;

    public Vehiculo(String plate, String description, String driverName, String route, String brand, String model) {
        this.plate = plate;
        this.description = description;
        this.driverName = driverName;
        this.route = route;
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", description='" + description + '\'' +
                ", driverName='" + driverName + '\'' +
                ", route='" + route + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}



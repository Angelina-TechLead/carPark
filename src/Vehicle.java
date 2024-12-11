public abstract class Vehicle {
    private String numberCar;
    private String brand;
    private String model;
    private int year;
    private double mileage;

    public Vehicle(String numberCar, String brand, String model, int year, double mileage) {
        this.numberCar = numberCar;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public abstract void service();
    public abstract String getVehicleType();
}
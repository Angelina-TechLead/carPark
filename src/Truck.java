public class Truck extends Vehicle implements Reservable {
    private double loadCapacity;
    private boolean trailer;
    private boolean reserved;

    public Truck(String numberCar, String brand, String model, int year, double mileage, double loadCapacity, boolean trailer) {
        super(numberCar, brand, model, year, mileage);
        this.loadCapacity = loadCapacity;
        this.trailer = trailer;
        this.reserved = false;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isTrailer() {
        return trailer;
    }


    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    @Override
    public void service() {
        System.out.println("Грузовик в сервисе номер: " + getNumberCar());
        // Логика обслуживания грузовика
    }

    @Override
    public String getVehicleType() {
        return "Грузовик";
    }

    @Override
    public boolean isReserved() {
        return reserved;
    }

    @Override
    public void cancelReservation() {
        reserved = false;
    }

    @Override
    public void reserve(String user) {
        if (reserved) {
            throw new RuntimeException("Грузовик занят");
        }
        reserved = true;
    }
}
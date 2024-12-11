public class Car extends Vehicle implements Reservable {
    private int doors;
    private String fuelType;
    private boolean reserved;

    public Car(String numberCar, String brand, String model, int year, double mileage, int doors, String fuelType) {
        super(numberCar, brand, model, year, mileage);
        this.doors = doors;
        this.fuelType = fuelType;
        this.reserved = false;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void service() {
        System.out.println("Машина в сервисе номер: " + getNumberCar());
    }

    @Override
    public String getVehicleType() {
        return "Машина";
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
            throw new RuntimeException("Машина занята");
        }
        reserved = true;
    }
}
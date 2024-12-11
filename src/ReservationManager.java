import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Vehicle> vehicles;

    public ReservationManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void reserveVehicle(String registrationNumber, String user) throws ReservationException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getNumberCar().equals(registrationNumber) && vehicle instanceof Reservable) {
                Reservable reservable = (Reservable) vehicle;
                reservable.reserve(user);
                return;
            }
        }
        throw new ReservationException("Транспортное средство не найдено или не подлежит резервированию.");
    }

    public void cancelReservation(String registrationNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getNumberCar().equals(registrationNumber) && vehicle instanceof Reservable) {
                Reservable reservable = (Reservable) vehicle;
                reservable.cancelReservation();
                return;
            }
        }
        System.out.println("Транспортное средство не найдено или не подлежит резервированию.");
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Reservable && !((Reservable) vehicle).isReserved()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }
}

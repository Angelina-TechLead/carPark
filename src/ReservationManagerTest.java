import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ReservationManagerTest {
    private ReservationManager manager;

    @BeforeEach
    public void setUp() {
        manager = new ReservationManager();
        manager.addVehicle(new Car("ABC123", "Toyota", "Camry", 2020, 15000, 4, "Petrol"));
        manager.addVehicle(new Truck("XYZ789", "Ford", "F-150", 2019, 20000, 1000.0, true));
    }

    @Test
    public void testCancelReservation() {
        manager.reserveVehicle("ABC123", "User1");
        manager.cancelReservation("ABC123");
        assertFalse(((Reservable) manager.getAvailableVehicles().get(0)).isReserved());
    }

    @Test
    public void testGetAvailableVehicles() {
        List<Vehicle> availableVehicles = manager.getAvailableVehicles();
        assertEquals(2, availableVehicles.size());

        manager.reserveVehicle("ABC123", "User1");
        availableVehicles = manager.getAvailableVehicles();
        assertEquals(1, availableVehicles.size());
        assertEquals("XYZ789", availableVehicles.get(0).getNumberCar());
    }
}

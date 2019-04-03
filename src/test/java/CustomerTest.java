import VehicleTypes.*;
import VehicleComponents.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CustomerTest {

    Customer customer;
    DealerShip dealership;
    Tesla tesla;
    Hybrid hybrid;

    @Before
    public void before() {
        dealership = new DealerShip("Jays Motors");
        customer = new Customer("Richard", 10000, null);

        ElectricEngine engine = new ElectricEngine(1200, true);
        Tyres tyres = new Tyres("Medium");
        tesla = new Tesla("Tesla", "X1", true, engine, tyres, 10000);
        hybrid = new Hybrid("Toyota", "Prius", "70/30", engine, tyres, 12000);
        dealership.addCarToGarage(tesla);
    }

    @Test
    public void customerCanBuyCar() {
        customer.buyCar(tesla);
        assertEquals(tesla, customer.getVehicle());
    }

    @Test
    public void cantBuyCarIfPoor() {
        customer.buyCar(hybrid);
        assertEquals(null, customer.getVehicle());
    }
}


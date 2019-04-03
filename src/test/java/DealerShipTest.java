import VehicleTypes.*;
import VehicleComponents.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DealerShipTest {

    DealerShip dealership;

    @Before
    public void before() {
        dealership = new DealerShip("Jays Motors");
    }

    @Test
    public void carsArrayStartsEmpty() {
        assertEquals(0, dealership.getGarageSize());
    }

    @Test
    public void canAddCarsToGarage() {
        ElectricEngine engine = new ElectricEngine(1200, true);
        Tyres tyres = new Tyres("Medium");
        Tesla tesla = new Tesla("Tesla", "X1", true, engine, tyres, 15000);
        dealership.addCarToGarage(tesla);
        assertEquals(1, dealership.getGarageSize());
    }

    @Test
    public void carCanMakeUniqueNoise() {
        ElectricEngine engine = new ElectricEngine(1200, true);
        Tyres tyres = new Tyres("Medium");
        Tesla tesla = new Tesla("Tesla", "X1", true, engine, tyres, 120000);
        assertEquals("The electric engine goes BRMMM", tesla.revEngine("BRMMM"));
    }

    @Test
    public void hybridCarCanMakeUniqueNoise() {
        HybridEngine engine = new HybridEngine(850, false);
        Tyres tyres = new Tyres("Small");
        Hybrid hybrid = new Hybrid ("Toyta", "Prius", "70/30", engine, tyres, 10000);
        assertEquals("The hybrid engine goes BAZOO", hybrid.revEngine("BAZOO"));
    }
}

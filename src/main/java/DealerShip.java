import VehicleTypes.IRevEngine;
import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class DealerShip {

    private String name;
    private ArrayList<Vehicle> garage;

    public DealerShip(String name) {
        this.name = name;
        this.garage = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGarageSize() {
        return this.garage.size();
    }

    public void addCarToGarage(Vehicle vehicle) {
        this.garage.add(vehicle);
    }
}


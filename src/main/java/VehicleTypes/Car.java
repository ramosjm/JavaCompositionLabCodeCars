package VehicleTypes;

import VehicleComponents.Engine;
import VehicleComponents.Tyres;

public class Car extends Vehicle implements IRevEngine{

    private String fuelType;

    public Car(String make, String model, String fuelType, Engine engine, Tyres tyres) {
        super(make, model, engine, tyres);
        this.fuelType = fuelType;
    }

    public String revEngine(String noise) {
        return "The diesel engine goes " + noise;
    }
}

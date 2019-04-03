package VehicleTypes;

import VehicleComponents.Engine;
import VehicleComponents.Tyres;

public class Hybrid extends Vehicle implements IRevEngine{

    private String fuelRatio;

    public Hybrid(String make, String model, String fuelRatio, Engine engine, Tyres tyres, int price) {
        super(make, model, engine, tyres, price);
        this.fuelRatio = fuelRatio;
    }

    public String revEngine(String noise) {
        return "The hybrid engine goes " + noise;
    }
}

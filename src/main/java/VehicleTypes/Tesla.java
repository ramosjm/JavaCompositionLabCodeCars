package VehicleTypes;

import VehicleComponents.Engine;
import VehicleComponents.Tyres;

public class Tesla extends Vehicle implements IRevEngine{

    private boolean autoPilot;

    public Tesla(String make, String model, boolean autoPilot, Engine engine, Tyres tyres) {
        super(make, model, engine, tyres);
        this.autoPilot = autoPilot;
    }

    public String revEngine(String noise) {
        return "The electric engine goes " + noise;
    }
}

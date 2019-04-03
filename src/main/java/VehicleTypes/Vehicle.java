package VehicleTypes;

import VehicleComponents.*;

public abstract class Vehicle {
    private String make;
    private String model;
    private Engine engine;
    private Tyres tyres;

    public Vehicle(String make, String model, Engine engine, Tyres tyres) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

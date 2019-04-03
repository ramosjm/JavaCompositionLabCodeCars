package VehicleTypes;

import VehicleComponents.*;

public abstract class Vehicle {
    private String make;
    private String model;
    private Engine engine;
    private Tyres tyres;
    private int price;

    public Vehicle(String make, String model, Engine engine, Tyres tyres, int price) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
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

package VehicleComponents;

public abstract class Engine {

    private int horsepower;
    private boolean nitro;

    public Engine(int horsePower, boolean nitro) {
        this.horsepower = horsePower;
        this.nitro = nitro;
    }
}

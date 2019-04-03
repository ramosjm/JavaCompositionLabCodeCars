package VehicleComponents;

public class ElectricEngine extends Engine {

    public ElectricEngine(int horsePower, boolean nitro) {
        super(horsePower, nitro);
    }

    public String makeNoise(String noise) {
        return "The electric engine goes" + noise;
    }

    public String revEngine(String noise) {
        return this.makeNoise(noise);
    }
}

import VehicleTypes.*;

public class Customer {

    private String name;
    private int funds;
    private Vehicle vehicle;

    public Customer(String name, int funds, Vehicle vehicle) {
        this.name = name;
        this.funds = funds;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void buyCar(Vehicle vehicle) {
        if (this.getFunds() >= vehicle.getPrice()) {
            this.setVehicle(vehicle);
        }
    }
}


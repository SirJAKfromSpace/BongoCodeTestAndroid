package q2_Vehicle;

/*
    Answer to Q2.B
    The design pattern used for this is the standard but intuitive Model pattern.
*/

public class ModelVehicle {
    private int wheels;
    private int passengers;
    private boolean gas;

    public ModelVehicle() {
        System.out.println("New Vehicle Instantiated! - "+this);
    }

    public int getWheels() { return wheels; }
    public void setWheels(int w) { wheels = w; }

    public int getPassengers() { return passengers; }
    public void setPassengers(int p) { passengers = p; }

    public boolean hasGas() { return gas; }
    public void setGas(boolean g) { gas = g; }
}
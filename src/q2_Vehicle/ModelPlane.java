package q2_Vehicle;

public class ModelPlane extends ModelVehicle {

    public ModelPlane() {
        super();
        setWheels(3);
        setPassengers(90);
        setGas(false);
        System.out.println("It's a Plane!");
    }

    public void TakeOff(){
        System.out.println("Shiiiiiieeewwwwww!");
    }

}
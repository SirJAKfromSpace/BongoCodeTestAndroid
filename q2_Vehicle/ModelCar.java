package q2_Vehicle;

public class ModelCar extends ModelVehicle {

    public ModelCar() {
        super();
        setWheels(4);
        setPassengers(5);
        setGas(true);
        System.out.println("It's a Car!");
    }

    public void StartEngine(){
        System.out.println("Vroom Vroom!");
    }

}
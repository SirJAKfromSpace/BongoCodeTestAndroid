import q1_Anagram.Anagram;
import q2_Vehicle.ModelCar;
import q2_Vehicle.ModelPlane;
import q2_Vehicle.ModelVehicle;

public class MainDriver {

	public static void main(String[] args) {
		// Main Java class that runs all the task along with their test cases
		
		System.out.println("- Q1 Anagram Checker -");
		Anagram.TestAnagram();
		// Anagram.ManualTestAnagram(); *manually type in test cases

		System.out.println("\n- Q2 Vehicle Classes -");
		ModelCar c = new ModelCar();
		c.StartEngine();
		ModelPlane p = new ModelPlane();
		p.TakeOff();

		System.out.println("\n- Q3 Video Player -");
	}
	
	

}

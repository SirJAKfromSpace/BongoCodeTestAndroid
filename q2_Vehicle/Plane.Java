package q2_Vehicle;

class Plane implements Vehicle{
	private int wheels;
	private int passengers;
	private float gas;
	
	public Plane(){
	    this.wheels = 3;
	    this.passengers = 90;
	    this.gas = 150000;
	}
	
	public int get_num_of_wheels() { return wheels; }
	public int get_num_of_passengers() { return passengers; }
	public boolean has_gas() {
		if(gas > 0) return true;
		else return false;
	}
}
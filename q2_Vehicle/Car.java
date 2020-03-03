package q2_Vehicle;

class Car implements Vehicle{
	private int wheels;
	private int passengers;
	private float gas;
	
	public Car(){
	    this.wheels = 4;
	    this.passengers = 5;
	    this.gas = 50;
	}
	
	public int get_num_of_wheels() { return wheels; }
	public int get_num_of_passengers() { return passengers; }
	public boolean has_gas() {
		if(gas > 0) return true;
		else return false;
	}
}
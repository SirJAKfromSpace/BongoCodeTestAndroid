package q2_Vehicle;

public interface Vehicle {
	int get_num_of_wheels();
	int get_num_of_passengers();
	boolean has_gas();
}

/*
	Answer to Q2

	The snippet given is an interface that can be implemented by subclasses to make use of it's functions.
	The Factory design pattern could most likely be used to take advantage of the interface.
	A VehicleFactory class can then be used to instantiate different vehicle types.

	---

	Answer to Q2.A

	The interface is to be implemented by the Car and Plane classes
	and the functions must return the corresponding vehicle's attributes.
	Demo Java classes (Car.java & Plane.java) written to show how that can be done.

*/

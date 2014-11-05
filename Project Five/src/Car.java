/**
 * 
 * @author Jordan
 * A class to store a list of specs on each vehicle in the lot
 */

public class Car {
	/* A variable to track the year of the car */
	public int year;
	/* A variable to track the brand of the car */
	public String make;
	/* A variable to track how many miles are on the car */
	public int mileage;
	/* Constructor function of object */
	public Car(int year, String make, int mileage){
		this.year = year;
		this.make = make;
		this.mileage = mileage;
	}
}

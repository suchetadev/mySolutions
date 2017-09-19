package SingletonImplement;

/*
 * Here I have implemented Eager Initialization way to implement singleton class.
 * "CarSingleton2" class is implemented as a singleton, so that at a time only one instance exists
 */

class CarSingleton2 {
	
	//private static variable of type "CarSingleton2"
	private static final CarSingleton2 singleton_instance = new CarSingleton2();
	
	//variable of type String
	public String car_number;
	
	//private constructor
	private CarSingleton2(){
		car_number = "abc";
	}
	
	//public static method which is global access point to get single instance 
	public static CarSingleton2 getInstance() {
		return singleton_instance;
	}
	
	
}

public class EagerInitialization {

	public static void main(String args[]) {
		
		CarSingleton2 obj1 = CarSingleton2.getInstance();
		
		CarSingleton2 obj2 = CarSingleton2.getInstance();
		
		obj1.car_number = "xyz";
		
		System.out.println("Car number obj1 : " + obj1.car_number);
		System.out.println("Car number obj2 : " + obj2.car_number);
		
		//check if only one instance is there 
		if(obj1.equals(obj2)) {
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
		}
		
	}
}

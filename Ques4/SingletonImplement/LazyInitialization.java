package SingletonImplement;

/*
 * Here I have implemented Lazy Initialization way to implement singleton class.
 * "CarSingleton" class is implemented as a singleton, so that at a time only one instance exists
 */

class CarSingleton {
	
	//private static variable of type "CarSingleton"
	private static CarSingleton singleton_instance = null;
	
	//variable of type String
	public String car_number;
	
	//private constructor
	private CarSingleton(){
		car_number = "abc";
	}
	
	//public static method which is global access point to get single instance 
	public static CarSingleton getInstance(){
		if(singleton_instance == null) {
			singleton_instance = new CarSingleton();
		}
		return singleton_instance;
	}
	
}

public class LazyInitialization {
	
	public static void main(String args[]) {
		
		CarSingleton obj1 = CarSingleton.getInstance();
		
		CarSingleton obj2 = CarSingleton.getInstance();
		
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

package SingletonImplement;

/*
 * Here I have implemented static block Initialization way to implement singleton class.
 * "CarSingleton1" class is implemented as a singleton, so that at a time only one instance exists
 */

class CarSingleton1 {
	
	//private static variable of type "CarSingleton1"
	private static CarSingleton1 singleton_instance;
	
	//variable of type String
	public String car_number;
	
	//private constructor
	private CarSingleton1(){
		car_number = "abc";
	}
	
	//static block
	static{
			singleton_instance = new CarSingleton1();
	}
	
	//public static method which is global access point to get single instance 
	public static CarSingleton1 getInstance() {
		return singleton_instance;
	}
	
	
}

public class StaticBlockInitialization {

	public static void main(String args[]) {
		
		CarSingleton1 obj1 = CarSingleton1.getInstance();
		
		CarSingleton1 obj2 = CarSingleton1.getInstance();
		
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

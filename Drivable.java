 /*6. InterfacesQuestion: Define an interface 'Drivable' with a method 'drive()'. 
 Create a class 'Car' that implements this interface and provides its own implementation of the 'drive()' method.
 Instantiate the 'Car' class and demonstrate the use of the 'drive()' method.*/
 
 
interface Drivable{
	void drive();
}

class Car implements Drivable{
	public void drive(){
		System.out.println("the car can easily drive");
	}
}

class Drive{
	public static void main(String[]args){
		Car car = new Car();
		car.drive();
	}
}
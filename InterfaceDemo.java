// it is pure abstraction  nothing but we did not use the concrate methods..

interface I1{
	void sound();
	
	
}

class Dog implements I1{
	 public void sound(){
		System.out.println("the dog make the sound");
	}
}

class InterfaceDemo{
	public static void main(String [] args){
		I1 dog = new Dog();
		dog.sound();
	}
}
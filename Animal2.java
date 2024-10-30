   /*4. Polymorphism Question: Implement a class hierarchy with a base class 'Animal' and derived classes 'Dog' and 'Cat'.
   Each class should have a method 'makeSound()' that outputs the sound specific to the animal. 
   Demonstrate runtime polymorphism by calling the 'makeSound()' method on references of type 'Animal'.*/
   
class Animal2{
	public void makeSound(){
		System.out.println("the animals dog and cat make the sounds like");
	}
}

class Dog extends Animal2{
	
	public void makeSound(){
		System.out.println("bark");
	}
}
class Cat extends Animal2{
	
	public void makeSound(){
		System.out.println("meow");
	}
}

class Hierarchy{
	public static void main(String [] args){
		Animal2 animal=new Animal2();
		animal.makeSound();
		Animal2 dog = new Dog();
		dog.makeSound();
		Animal2 cat = new Cat();
		cat.makeSound();
	}
}



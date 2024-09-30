
// single inheritance

class Parent{
	
	int age;
	double salary;
	String name;
}

class SingleInheritance extends Parent{
	
	public static void main(String [] args){
		
		SingleInheritance sem = new SingleInheritance();
		
		sem.display();
	}
	
	public void display(){
		System.out.println("the age is ::" +age);
		System.out.println("the salary is::" + salary);
		System.out.println("the name is ::" + name);
	}
}
	
	
	
//multi-level inheritance

class GrandParent{
	int age;
	String name;
}

class Parent extends GrandParent{
	double salary;
	String accountnumber;
}

class Child extends Parent{
	
	public static void main(String [] args){
		Child child = new Child();
		child.display();
	}


public void display(){
	
	System.out.println("the age is::" +age);
	System.out.println("the name is::" +name);
	System.out.println("the salary is::" +salary);
	System.out.println("the accountnumber is::" +accountnumber);
}
}
		
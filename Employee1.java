 /*Create a base class 'Employee' with attributes 'name' and 'salary'. Define a subclass 'Manager' that adds an 
 additional attribute 'department'. Write a program to demonstrate inheritance and method overriding
 by creating objects of both classes and displaying their details*/	
 
class Employee1{
	String name;
	double salary;
	public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
	
	public void display(){
		System.out.println("the employee name:"+name);
		System.out.println("the employee salary:"+salary);
}
}

class Manager extends Employee1{
	String department;
	
	 public Manager(String name,double salary, String department) {
        super(name,salary);
        this.department = department;
    }
	
	public void display(){
		super.display();
		System.out.println("the employee department:"+department);
	}
	public static void main(String[]args){
		Manager s1=new Manager("iswarya",60000,"software");
		s1.display();
		
	}
}
 
	
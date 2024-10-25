// write a programm using overriding rules...

class Parent{
	 protected Parent  action(){
	System.out.println("the father has sitting on the floor");
	return new Parent();
		
	}
	
}

class Child extends Parent{
        
    public Child action(){
	super.action();
	System.out.println("the fathe has sitting on the floor");
	return new Child();
		
	}
}
class Overriding1{
	
	public static void main(String []args){
		Child obj = new Child();
		obj.action();
	}
}
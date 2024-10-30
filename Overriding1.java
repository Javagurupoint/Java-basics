// write a programm using overriding rules...

class Parent{
	 protected void Parent  action(){
	System.out.println("the father has sitting on the floor");
	
		
	}
	
}

class Child extends Parent{
        
    public void Child action(){
		super.action()
	
	System.out.println("the fathe has sitting on the floor");
		
	}
}
class Overriding1{
	
	public static void main(String []args){
		Child obj = new Child();
		obj.action();
	}
}
// multiple  inheritance 

class Father{
	
	public void showF(){
		System.out.println("this the father1 age");
		
	}
}

class Father1{
	
	public void showFa(){
		
		System.out.println("this the father2 age");
	}
}

class Child extends Father1, Father2{
public static void main(String [] args){
	
	Child c1 = new Child();
	c1.showFa();
	c1.showF();
}
}
	

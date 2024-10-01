// hierarcheical inheritance

class Parent2{
	
	public void showP2(){
		
		System.out.println("this is the father of 3 childrens");
	}
}

class Son1 extends Parent2{
	
	public void showS1(){
		
		System.out.println("He is the  first child");
	}
}

class Son2 extends Parent2{

public void showS2(){
System.out.println("He is the second child");
}
}

class Daughter extends Parent2{

public void showD1(){

System.out.println("She is the third child");
}

public static void main(String [] args){
	Son1 obj1 = new Son1();
	obj1.showP2();
	obj1.showS1();
	Son2 obj2 = new Son2();
	//obj2.showP2();
	obj2.showS2();
	Daughter obj = new Daughter();
	//obj.showP2();
	obj.showD1();
}
}
	
	
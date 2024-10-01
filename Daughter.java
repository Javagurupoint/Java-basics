//Hybrid inheritance


class GrandFather{
	public void showG(){
		System.out.println("this is grand father");
	}
}

class Father extends GrandFather{
	public void showF(){
		System.out.println("this is father");
	}
}

class Son extends Father{
	public void showS(){
		System.out.println("this is son");
	}
}
 public class Daughter extends Father{
	public void showD(){
		System.out.println("this is the daughter");
	}
	public static void main(String [] args){
		Son s1 = new Son();
		s1.showG();
		s1.showF();
		s1.showS();
		Daughter s2 = new Daughter();
		s2.showG();
		s2.showF();
		s2.showD();
	}
}
		
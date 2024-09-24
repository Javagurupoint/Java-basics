class DefaultContructorInJava{
	int age;
	String name;
	
	//This is default constructor
	private DefaultContructorInJava(){
		
	}
	public static void main(String[] args){
		DefaultContructorInJava d = new DefaultContructorInJava();
		System.out.println("Default value of i: "+d.age);
		System.out.println("Default value of s: "+d.name);
	}
}
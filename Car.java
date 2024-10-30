class Car{
	
	private String brand;
	private String color;
	private int year;
	
    Car(String brand, String color, int year){
		this.brand=brand;
		this.color=color;
		this.year=year;
	}
		
	public void setbrand(String brand){
		this.brand=brand;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public void setyear(int year){
		this.year=year;
	}
	
	
	public void display(){
		System.out.println("the car name:"+brand);
		System.out.println("the color:"+color);
		System.out.println("car year:"+year);
	}
}

class Car1{
	public static void main(String[]args){
		Car car1=new Car("honda","red",1946);
		car1.display();
		Car car2=new Car("Toyota", "Red", 2020);
		car2.display();
	}
}

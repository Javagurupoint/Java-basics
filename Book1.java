/*8. Constructor Overloading Question: Create a class 'Book' with attributes 'title', 'author', and 'price'.
 Overload the constructor to allow creating 'Book' objects with different combinations of these attributes
 (e.g., title and author, or title, author, and price). Write a program to demonstrate creating 'Book' objects 
 using different constructors and displaying their information.*/
 

class Book1{
	String title;
	String author;
	double price;
	
	public Book1(String title,String author){
		this.title=title;
		this.author=author;
	}
	
	public Book1(String title, String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display(){
		System.out.println("the book title is:"+title);
		System.out.println("the book author name is:"+author);
		System.out.println("the book price is:"+price);
	}
}

class Main{
	public static void main(String[]args){
		Book1 b1=new Book1("ramayana","valmiki");
		b1.display();
		Book1 b2 = new Book1("ramayana","valmiki",4675);
		b2.display();
	
	}
}
		

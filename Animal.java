
/*Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods
 differently based on their specific behavior.*/



abstract class Animal{  //abstract class
  
  public abstract void eat(); // abstarct method
  public abstract void sleep(); //abstarct method 
}

class Lion extends Animal{
  
  public void eat(){ //method
    System.out.println("the lion eats meat");
  }
  
  public void sleep(){
    System.out.println("the lion sleeps on the grass");
  }
}

class Tiger extends Animal{
  
  public void eat(){
    
    System.out.println("the tiger eats some food");
  }
  public void sleep(){
    System .out.println("the tiger sleeps on the grass");
  }
}

class Deear extends Animal{
  
  public void eat(){
    System.out.println("the deear the bisukets");
  }
  
  public void sleep(){
    
    System.out.println("the deear sleeps on the grass");
  }
}

class Main{
  
  public static void main(String [] args){
    
    Animal lion = new Lion();
    lion.eat();
    lion.sleep();
    
    Animal tiger = new Tiger();
    tiger.eat();
    tiger.sleep();
    
    Animal deear = new Deear();
    deear.eat();
    deear.sleep();
  }
}

abstract class Animal{
  
  public abstract void eat();
  public abstract void sleep(); //same the above 
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

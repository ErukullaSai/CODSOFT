package javaTopics;
//Abstract classes
 abstract class firstclass {
//abstraction means identifying the required details of an object ignoring unuseful details
   // abstract class contains the method that are declared but not intialised
   public abstract void  drive();//abstract methods
   public abstract void fly();
   public void music(){//we can intialise  non abstract methods 
    System.out.println("play music");
   }
  }
 class subclass extends firstclass{
    public void drive(){
        System.out.println("driving");
    }
    public void fly(){
        System.out.println("flying");
    }
   }
 public class Abstraction{
    public static void main(String[] args) {
        subclass obj = new subclass() ;
        obj.drive();
        obj.fly();
        obj.music();
    }
 }
  

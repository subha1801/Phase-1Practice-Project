package oops;
class Animal 
{
 void habit()
 {
  System.out.println("I am Mamal!! ");
 }
}

class Mammal extends Animal 
{
 void nature()
 {
  System.out.println("I hang upside down!! ");
 }
}

class Bat extends Mammal 
{
 void hobby()
 {
  System.out.println("I fly !! ");
 }
}

public class InheritanceExp 
{
 public static void main(String args[])
 {
  Bat b = new Bat();
  b.habit();
  b.nature();
  b.hobby();
 }
}
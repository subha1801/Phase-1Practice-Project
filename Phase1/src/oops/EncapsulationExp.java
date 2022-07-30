package oops;
class Encapsulate 
{ 
   
    private String Name; 
    private int Height; 
    private int Weight; 
    
    public int getHeight()  
    { 
      return Height; 
    } 
   
 
    public String getName()  
    { 
      return Name; 
    } 
      

    public int getWeight()  
    { 
       return Weight; 
    } 
   

    public void setWeight( int newWeight) 
    { 
      Weight = newWeight; 
    } 
   

    public void setName(String newName) 
    { 
      Name = newName; 
    } 

    public void setHeight( int newHeight)  
    { 
      Height = newHeight; 
    } 
} 

public class EncapsulationExp
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
          
    
        obj.setName("Jash"); 
        obj.setWeight(70); 
        obj.setHeight(178); 
          
    
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My height: " + obj.getWeight()); 
        System.out.println("My weight " + obj.getHeight()); 
           
    } 
} 
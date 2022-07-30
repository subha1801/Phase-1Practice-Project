package diamond;
interface Interface1  
{  
public default void display()   
{  
System.out.println("the display() method of Interface1 invoked");  
}  
}  
interface Interface2  
{  
public default void display()   
{  
System.out.println("the display() method of Interface2 invoked");  
}  
}  
public class Diamond implements Interface1, Interface2  
{  
public void display()   
{  
Interface1.super.display();  
Interface2.super.display();  
}  
public static void main(String args[])   
{  
Diamond obj = new Diamond();  
obj.display();  
}  
}  
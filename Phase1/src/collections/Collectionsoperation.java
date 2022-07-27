package collections;
import java.util.*;
public class Collectionsoperation {
	public static void main(String[] args) {
		//arraylist
		System.out.println("ArrayList");
		ArrayList<String> fruit=new ArrayList<String>();   
	      fruit.add("Mango");//
	      fruit.add("Apple");    	   
	      System.out.println(fruit);  
		
		// vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> b = new Vector();
	      b.clear(); 
	      b.addElement(90); 
	      System.out.println(b);
		
		//linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> month=new LinkedList<String>();  
	      month.add("Jan");  
	      month.add("Feb");  
	      month.add("Mar");
	      month.add("April");
	      System.out.println("linkedlist"+month);
	      Iterator<String> itr=month.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //hashset
	       System.out.println("\n");
	       System.out.println("=>HashSet");
	       HashSet<String> s=new HashSet<String>();  
	       s.add("j");  
	       s.add("a");  
	       s.add("v");
	       s.add("a");
	       System.out.println(s);
	       System.out.println("is hashset empty  " + s.isEmpty());
		   System.out.println("remove the element "+s.remove("a"));
	       //linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> s2=new LinkedHashSet<Integer>();  
	       s2.add(50);  
	       s2.add(60);  
	       s2.add(70);
	       s2.add(80);
	       System.out.println(s2);
	       System.out.println("\nRemove: " + s2.remove(3));
	      	} 
	      }  
	}



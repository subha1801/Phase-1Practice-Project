package mapping;
import java.util.*;
import java.util.TreeMap;
	public class MapOp {

		public static void main(String[] args) {
			
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Damon");    
		      hm.put(2,"Stefan");    
		      hm.put(3,"Dustin");   
		      System.out.println("hashmap is "+ hm);
		      System.out.println("Value of 3 key: "+ hm.get("3"));
		      System.out.println("Is HashMap empty? "+hm.isEmpty());
		      hm.remove("2");
		      System.out.println("After removal process, the hashmap is "+hm);
		      System.out.println("Size of the HashMap: "+hm.size());
		      System.out.println(hm.containsValue("FIFTH"));
		      
		     //HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Massimo");  
		      ht.put(5,"Tiffin");  
		      ht.put(6,"Dacota");  
		      ht.put(7,"Emilla");
		      System.out.println("Hashtable is "+ht);
		      System.out.println("Value of key 2: "+ht.get(1));
		      System.out.println("Size of the Hashtable is  "+ht.size());

		          
		      
		      //TreeMap
	
		      TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
		        marks.put("Student1", 80);
		        marks.put("Student2", 99);
		        marks.put("Student3", 60);  
		        for(String key: marks.keySet()){
				System.out.println(key  +" : "+ marks.get(key));
	      
	     
;
		        }
		    }
		}
		     
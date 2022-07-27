package operationsofstring;

public class Mutablestring {
	public static void main(String args[]){  
		//string buffer
		StringBuffer j=new StringBuffer("Hello "); 
		j.append("Frnds");        
		System.out.println(j);   
		
		j.insert(2,"hi");     //now original string is changed  
		System.out.println(j);  
		
		j.replace(0,3,"hm");  
		System.out.println(j);
		
		j.delete(0,3);  
		System.out.println(j);
		//string builder

		StringBuilder s = new StringBuilder("hello");
		
		System.out.println(s);
		s.append("World");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.reverse());
	}
}
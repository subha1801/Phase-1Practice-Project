package modifier;

public class ClassM {
	public void PublicMethod(){
		PrivateMethod();
		defaultMethod();
		
	}
	void defaultMethod(){
		System.out.println( "value of long in class M is "+ l);
	}
	private void PrivateMethod(){
		System.out.println( "value of int in class M is "+ x);
	}
	protected void ProtectedMethod(){
		System.out.println( "value of float in class M is "+ y);
	}
 
 long l=235l;
 private int x=20;
 protected float y=23.5f;
	
}

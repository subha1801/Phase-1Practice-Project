package modifierchild;
import modifier.ClassM;
import modifier.ClassP;
import modifier.ClassN;
public class ClassZ extends ClassN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassX().PublicMethod();
		new ClassN().PublicMethod();
		new ClassM().PublicMethod();
		
		new ClassZ().ProtectedMethod();
		new ClassP().MethodInP();
		System.out.println( "value of long in class X is "+new ClassX().l);
		System.out.println( "value of float in class X is "+new ClassX().f);
		System.out.println( "value of char in class X is "+new ClassX().c);
	
	}

}
package modifierchild;
import modifier.ClassN;
import modifier.ClassM;
public class ClassY extends ClassN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassX().PublicMethod();
		new ClassN().PublicMethod();
		new ClassM().PublicMethod();
		
		new ClassY().ProtectedMethod();
		System.out.println( "value of int in class N is "+ new ClassN().k);
		System.out.println( "value of long in class X is "+new ClassX().l);
		System.out.println( "value of float in class X is "+new ClassX().f);
		System.out.println( "value of char in class X is "+new ClassX().c);
	}

}

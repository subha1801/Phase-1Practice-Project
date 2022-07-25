package modifier;

public class ClassP {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			new ClassM().PublicMethod();
			new ClassM().ProtectedMethod();
			//new M().defaultMethod();
			//new N().PublicMethod();
			new ClassN().ProtectedMethod();
			new ClassN().DefaultMethod();
			new ClassP().MethodInP();
			

	}
		public void MethodInP(){
			System.out.println( "value of int in class N is "+ new ClassN().k);
		}
	}

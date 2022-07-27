package typecasting;
import java.util.*;
public class TypeCast {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter the value of a: ");
		a=sc.nextInt();
		double d,d1;
		d=a;
		System.out.println("Implicit TypeCasting");
		System.out.println("After Typecasting : "+ d);
		d1=a+5.6;
		System.out.println("After Typecasting : "+ d1);
		System.out.println("Explicit TypeCasting");
		double d2;
		System.out.print("Enetr the value of d2 : ");
		d2=sc.nextDouble();
		int i1=(int)d2;
		System.out.println("After TypeCasting : "+ i1);
		int v;
		System.out.print("Enter the value of v: ");
		v=sc.nextInt();
		char c=(char)v;
		System.out.println("After Typecasting : "+ c);
		
	}
}
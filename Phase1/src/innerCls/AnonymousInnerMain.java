package innerCls;



interface employId
{
	int y = 405065;
	void getemployId();
}
public class AnonymousInnerMain
{
	public static void main(String[] args)
	{
	
		MyClass obj=new MyClass();
		obj.getemployId();	
	}
}

class MyClass implements employId
{
	//Override
	public void getemployId()
	{
		// printing  age
		System.out.print("employId is "+y);
	}
}

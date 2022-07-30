package thread;
import java.io.*;
class Line
{
	
	synchronized public void getLine()                     
	{
		
		for (int x = 0; x < 3; x++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+x);
			try
			{
				Thread.sleep(500);   //0.5 s
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Bus extends Thread
{
	Line line;

	Bus(Line line)
	{
		this.line = line;
	}

	
	public void run()
	{
		line.getLine();
	}
}

public class Synchro
{
	public static void main(String[] args)
	{
		
		Line obj = new Line();

		
		Bus Bus1 = new Bus(obj);
		Bus Bus2 = new Bus(obj);
		
		Bus1.setName("Bus 1");
		Bus2.setName("Bus 2");
		Bus2.start();
		Bus1.start();
	}
}

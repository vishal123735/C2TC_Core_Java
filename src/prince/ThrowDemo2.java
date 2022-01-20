package prince;
import java.io.IOException;

public class ThrowDemo2 {
	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String[] args) {
		ThrowDemo2 d=new ThrowDemo2();
		d.p();
		System.out.println("normal flow...");
	}


}

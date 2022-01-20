package prince;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException ar)
		{
			ar.printStackTrace();
		System.out.println("Error:"+ar.getMessage());
		}
		System.out.println("Exception Handling Demo");

	}

}

package prince;
import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		
		try
		{
			if(id<100)
			{
				System.out.println("Student found");
				throw new StudentIdNotFound(id);
				
			}
			else
			{
				System.out.println(id);
			}
		}
		catch(StudentIdNotFound e)
		{
			System.out.println(e.getMessage());
		}
	}

}

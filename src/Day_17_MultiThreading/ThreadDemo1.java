package Day_17_MultiThreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A oa1=new A(10,1,"first");
		A oa2=new A(5,0,"Second");
		
		B ob=new B("Third");
		
		Thread t1=new Thread(oa1);
		Thread t2=new Thread(oa1);
		Thread t3=new Thread(ob);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		try
		{
			
		
		t1.join();
		t2.join();
		t3.join();
		}
		
		catch(Exception e) {
			
		}
		System.out.println(" Have A Nice Day");
		
	
		

	}

}

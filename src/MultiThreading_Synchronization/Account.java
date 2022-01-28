package MultiThreading_Synchronization;

public class Account {
	static int balance=10000;
		public static void main(String[]args) {
			AClass oa=new AClass();
			DepositThread dt1=new DepositThread(oa,5000);
			DepositThread dt2=new DepositThread(oa,6000);
			
			
			dt1.start();
			dt2.start();
			try
			{
				dt1.join();
				dt2.join();
			}
			catch(Exception e) {
				
			}
			System.out.println("Total balance is:" +balance);
		}

}

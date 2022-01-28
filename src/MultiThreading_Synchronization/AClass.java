package MultiThreading_Synchronization;

public class AClass {
	int bal;
	synchronized void deposit(int amt)
	{
		System.out.println("getting balance");
		int newbal=getBalance();
		bal=newbal+amt;
		setBalance(bal);
		
		
	}
	int getBalance() {
		return Account.balance;
		
	}

	void setBalance(int amt)
	{
		try
		{
			Thread.sleep(3000);
		
		
		}
		catch(Exception e)
		{
			
		}
		Account.balance=amt;
	}
	
}

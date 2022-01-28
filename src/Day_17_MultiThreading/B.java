package Day_17_MultiThreading;

public class B implements Runnable{
	String msg;

	public B(String msg) {
		
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<msg.length();i++)
		{
			try {
				Thread.sleep(2000);
			}
			
			catch(Exception e) {
				
			}
			
			System.out.println(msg.charAt(i));
		}
	}
	
	
}

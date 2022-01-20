package prince;
class bank {
	float getRateOfInterest()
	{
		return 6.9f;
	}
	
}
class SBI extends bank 
{
	float getRateOfInterest()
	{
		return 5.9f;
	}
}
class Axis extends bank
{
	float getRateOfInterest()
	{
		return 9.7f;
	}
}
class ICICI extends bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		bank obj1=new Axis();
		System.out.println(obj1.getRateOfInterest());

	}

}

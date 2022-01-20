package prince;
class car
{
	final int max_speed=130;
	
	void controlSpeed()
	{
		//max_Speed=180;
		System.out.println("Max speed of car is"+max_speed);
	}
}
public class FinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car();
		obj.controlSpeed();

	}

}

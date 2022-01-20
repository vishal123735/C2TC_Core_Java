package prince;

abstract class bank1 { 
	abstract float interest();
	void display() {
		System.out.println("Abstract class");
	}
}
class SBI1 extends bank1 
{

	@Override
	float interest() {
		// TODO Auto-generated method stub
		return 3.9f;
	}
	
}
class Axis1 extends bank1 
{

@Override
	float interest() {

		return 8.9f;
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis1 a=new Axis1();
		System.out.println("Rate of interest of Axis"+a.interest());
		a.display();
		
		bank1 s =new SBI1();
		s.display();
		System.out.println("Rate of interest of SBI "+s.interest());
	}

}

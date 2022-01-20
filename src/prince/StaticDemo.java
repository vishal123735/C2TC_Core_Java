package prince;

public class StaticDemo {
	
	int a=10;
	int b;
	static int c=25;
	
	void func1()
	{
		System.out.println(" the values are");
		System.out.println(" a vlaues is " + a);
		System.out.println(" b vlaues is " + b);
		System.out.println(" c vlaues is " + c);
	}
	
	static void func2()
	{
		int d=19;
		System.out.println(" d vlaues is " + d);
		System.out.println(" c vlaues is " + c);
	}
	
	static
	{
		System.out.println("Hi am in static block");
		//System.exit(0);
	}

	public static void main(String[] args) {
		System.out.println("c values is" + StaticDemo.c);
		StaticDemo obj=new StaticDemo();
		obj.func1();
		StaticDemo.func2();

	}

}

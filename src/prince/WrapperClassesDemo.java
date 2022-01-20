package prince;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// unboxing
		Integer i=new Integer(20);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		
		//autoboxing
		int a=50;
		Integer i1=a;
		System.out.println(i1);
		

	}

}

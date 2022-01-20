package prince;

public class MethodOverLoading {
	int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	float add(float a, float b)
	{
		float sum=a+b;
		return sum;
	}
	float add(int a,float b,int c )
	{
	float sum=a+b+c;
	return sum;
	}
float add(float a,int b, int c)
{
	float sum =a+b+c;
	return sum;
}
public static void main(String[]args) {
	MethodOverLoading obj=new MethodOverLoading();
	System.out.println(obj.add(10,20));
	System.out.println(obj.add(10.5f,20.3f));
	System.out.println(obj.add(31,20.9f,50));
	System.out.println(obj.add(5.9f,79,20));
	

	}

}

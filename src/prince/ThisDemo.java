package prince;
class Animal
{
	int leg;
	String name;
	String color;
	
	public Animal() 
	{
	System.out.println("this is default constructor");	
	}
	public Animal(String name) {
		this();
		this.name = name;
	}
	public Animal(String name, String color) {
		this(name);
		
		this.color = color;
	}
	public Animal(int leg, String name, String color) {
		this();
		this.leg = leg;
		this.name = name;
		this.color = color;
	}
	void display()
	{
	
System.out.println("Animal description");
System.out.println(color+" "+"color"+" "+name+" "+"with"+" "+" "+leg+" "+"legs");
	};
}

public class ThisDemo {

	public static void main(String[] args) {
		Animal obj1=new Animal(4,"cat","white");
		obj1.display();
		Animal obj2=new Animal("dog","black");
		obj2.display();
		
			

	}

}


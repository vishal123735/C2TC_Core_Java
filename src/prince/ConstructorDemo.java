package prince;
class student {
	int id;
	String name;
	String course;
	String email;
	student(){
		
	}

	public student(int id, String name, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}


	public void display() 
	{
		System.out.println("studentinformation:");
		System.out.println(id +" " +name +" "+ course +" "+ email);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		student s1=new student();
		s1.id=1;
		s1.name="vishal";
		s1.course="Bscit";
		s1.email="vg9085141@gmail.com";
		s1.display();
		student s2=new student(2,"prince","ssc","dgjdb");
		s2.display();
				
		

	}

}

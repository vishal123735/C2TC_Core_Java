package prince;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("sum is " + (a+b));
    UserInput obj=new UserInput();
    System.out.println(obj.getClass());
    System.out.println(obj.hashCode());

	}

}

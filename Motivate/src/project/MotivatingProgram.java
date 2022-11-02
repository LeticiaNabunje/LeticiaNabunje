package project;
import java.util.*;

public class MotivatingProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name;
		int age;
		int age1;
		String dateOfBirth;
		

		System.out.println("Enter your date of birth:");
		dateOfBirth = s.nextLine();
		
		System.out.println("Enter your name:");
		name = s.nextLine();
		
		System.out.println("Enter your age:");
		age = s.nextInt();
		
		System.out.println("Enter your new age:");
		age1 = s.nextInt();
		
		System.out.println("Year of birth:"+dateOfBirth);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("New age:" + age1);
		
		

	}

}

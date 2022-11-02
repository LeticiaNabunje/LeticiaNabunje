package project;
import java.util.*;

public class MotivatingProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name;
		String dateOfBirth;
		String activity;
		int year;
		int date;
		String month;
		String school;
		String hobby;

//		String responses [] response = {
//				String y,
//				String n
//		};
		
		System.out.println("Enter your name:");
		name = s.nextLine();
		
		System.out.println("Hello " + name + ", May I talk to you for a minute ?\n"
				+ "Enter y for yes and n for no ");
		String response = s.nextLine();
		
		if(response.equals("y")) {

			System.out.println("What have you been doing ?");
			activity = s.nextLine();

			System.out.println("In which month were you born ?");
			month = s.nextLine();
			
			System.out.println("To which school do you go ?");
			school = s.nextLine();
			
			System.out.println("What is your hobby ?");
			hobby = s.nextLine();
			
			System.out.println("In which year were you born ?");
			year = s.nextInt();
			
			int age = 2022 - year;
			
			
			System.out.println("On which date were you born ?");
			date = s.nextInt();
			
			
			System.out.println("Ouky,.....i have gathered some brief imformation about you...lets chat.!" + ""
					+ "Welcome back from " + activity + " ."
							+ "You are " + age + "years old." + ""
									+ "You will be celebrating your birth on " + date + "in " + month + "every year" + ""
											+ ". How is life at " + school + "?" + ""
													+ "Do you have any reasonsfor enjoying " + hobby + "?" + ""
															+ "Anyways, nice to meet you " + name + " !Byebye!!!!");
			
		}else if(response.equals("n")){
			System.out.println("Oraba otakwenda obireke.......Batulabire");
		}else {
			System.out.println("Invalid input");
		}
		 
		 
		
		
		
		
	
	}

}

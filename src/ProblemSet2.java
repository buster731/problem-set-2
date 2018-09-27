/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;

public class ProblemSet2 {
	Scanner in = new Scanner(System.in);
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("Hey, what\'s your name? First and Last please");
		String inName = in.nextLine();
		System.out.println("Hello " + inName + ". Nice to meet you!");
	}
	
	public void gradeMe() {
		System.out.println("What is your first homework grade?");
		int hwA = in.nextInt();
		System.out.println("What is your second homework grade?");
		int hwB = in.nextInt();
		System.out.println("What is your third homework grade?");
		int hwC = in.nextInt();
		int hwSum = hwA + hwB + hwC;
		float hwAvg = (hwSum) / 3;
		System.out.println("What is your first quiz grade?");
		int qzA = in.nextInt();
		System.out.println("What is your second quiz grade?");
		int qzB = in.nextInt();
		System.out.println("What is your third quiz grade?");
		int qzC = in.nextInt();
		int qzSum = qzA + qzB + qzC;
		float qzAvg = (float)(qzSum)/3;
		System.out.println("What is your first test grade?");
		int tstA = in.nextInt();
		System.out.println("What is your second test grade?");
		int tstB = in.nextInt();
		System.out.println("What is your third test grade?");
		int tstC = in.nextInt();
		int tstSum = tstA + tstB + tstC;
		float tstAvg = (float)(tstSum)/3;
		double finGrade = (hwAvg * .15) + (qzAvg * .3) + (tstAvg * .55);
		System.out.print("Final grade: " + finGrade);
	}
	
	public void groupUs() {
		System.out.println("How many students are going on the trip?");
		int students = in.nextInt();
		System.out.println("How many teachers are going on the trip?");
		int teachers = in.nextInt();
		int attendees = teachers + students;
		int numBuses = attendees / 47;
		int lastBusCt = 47 - (attendees % 47);
		System.out.println("You will need " + (numBuses - 1) + "buses of 47 people and one bus of " + lastBusCt + "people.");
	}
	
	public void info() {
		System.out.println("Please print your first name");
		String fName = in.nextLine();
		System.out.println("Please print your last name");
		String lName = in.nextLine();
		System.out.println("Please print your grade level");
		int grade = in.nextInt();
		System.out.println("Please print your age");
		int age = in.nextInt();
		System.out.println("Please print your hometown");
		String town = in.nextLine();
		System.out.println("NAME\t: " + fName + " " + lName);
		System.out.println("GRADE\t: " + grade);
		System.out.println("AGE\t: " + age);
		System.out.println("HOMETOWN\t: " + town);
	}
	
	public void initials() {
		System.out.println("Please print your first name");
		char firstName = in.nextLine().charAt(0);
		System.out.println("Please print your middle name. If you don\'t have one, please print \-");
		String middleName = in.nextLine().charAt(0);
		System.out.println("Please print your last name");
		String lastName = in.nextLine().charAt(0);
		System.out.println("Your initials are " + firstName + middleName + lastName + ".");
	}
	in.close();
}

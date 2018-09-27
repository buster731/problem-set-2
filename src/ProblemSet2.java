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
		Scanner inHello = new Scanner(System.in);
		System.out.println("Hey, what\'s your name? First and Last please");
		String inName = inHello.nextLine();
		System.out.println("Hello " + inName + ". Nice to meet you!");
		inHello.close();		
	}
	
	public void gradeMe() {
		Scanner inHWA = new Scanner(System.in);
		System.out.println("What is your first homework grade?");
		int hwA = inHWA.nextInt();
		System.out.println("What is your second homework grade?");
		int hwB = inHWA.nextInt();
		System.out.println("What is your third homework grade?");
		int hwC = inHWA.nextInt();
		int hwSum = hwA + hwB + hwC;
		float hwAvg = (hwSum) / 3;
		System.out.println("What is your first quiz grade?");
		int qzA = inHWA.nextInt();
		System.out.println("What is your second quiz grade?");
		int qzB = inHWA.nextInt();
		System.out.println("What is your third quiz grade?");
		int qzC = inHWA.nextInt();
		int qzSum = qzA + qzB + qzC;
		float qzAvg = (float)(qzSum)/3;
		System.out.println("What is your first test grade?");
		int tstA = inHWA.nextInt();
		System.out.println("What is your second test grade?");
		int tstB = inHWA.nextInt();
		System.out.println("What is your third test grade?");
		int tstC = inHWA.nextInt();
		int tstSum = tstA + tstB + tstC;
		float tstAvg = (float)(tstSum)/3;
		double finGrade = (hwAvg * .15) + (qzAvg * .3) + (tstAvg * .55);
		System.out.print("Final grade: " + finGrade);
		inHWA.close();
	}
	
	public void groupUs() {
		Scanner trpCount = new Scanner(System.in);
		System.out.println("How many students are going on the trip?");
		int students = trpCount.nextInt();
		System.out.println("How many teachers are going on the trip?");
		int teachers = trpCount.nextInt();
		int attendees = teachers + students;
		int numBuses = attendees / 47;
		int lastBusCt = 47 - (attendees % 47);
		System.out.println("You will need " + (numBuses - 1) + "buses of 47 people and one bus of " + lastBusCt + "people.");
		trpCount.close();
	}
	
	public void info() {
		Scanner pInfo = new Scanner(System.in);
		System.out.println("Please print your first name");
		String fName = pInfo.nextLine();
		System.out.println("Please print your last name");
		String lName = pInfo.nextLine();
		System.out.println("Please print your grade level");
		int grade = pInfo.nextInt();
		System.out.println("Please print your age");
		int age = pInfo.nextInt();
		System.out.println("Please print your hometown");
		String town = pInfo.nextLine();
		System.out.println("NAME\t: " + fName + " " + lName);
		System.out.println("GRADE\t: " + grade);
		System.out.println("AGE\t: " + age);
		System.out.println("HOMETOWN\t: " + town);
		pInfo.close();
	}
	
	public void initials() {
		
	}
}
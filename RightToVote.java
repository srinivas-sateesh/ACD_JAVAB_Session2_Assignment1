import java.util.Scanner;
public class RightToVote {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = reader.nextInt();
		if (age >= 18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("You are NOT eligible to vote until you are 18 years old");
		 
		
	}
}

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int seconds = 86400;
		
		//your code goes here
		//System.out.println("please enter number of days ");
		System.out.println(days*seconds);
	}
}
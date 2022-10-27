import java.util.Scanner;

public class ProjectArrays
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		String astaga = "";
		for(byte x = 0; x <  text.length();x++){
			astaga = arr[x] + astaga;

		}
		System.out.print(astaga);
	}
}
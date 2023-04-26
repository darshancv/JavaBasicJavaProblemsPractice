import java.util.Scanner;

public class Trimex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		String result = toTrim(input);
		System.out.println(result + "asf");

	}

	private static String toTrim(String input) {

		String result = "";
		int start = 0;
		int end = input.length() - 1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				start = i;
				break;
			}
		}
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) != ' ') {
				end = i;
				break;
			}
		}
		for (int i = start; i <= end; i++) {
			result = result + input.charAt(i);
		}

		return result;
	}

}

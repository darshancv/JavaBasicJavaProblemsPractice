import java.util.*;

public class Practiceee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String input = sc.nextLine();
		boolean isContinue = true;
		do {
			int opt = menu();
			switch (opt) {
			case 1:
				System.out.println(vowel(input));
				break;
			case 2:
				System.out.println(changeCase(input));
				break;
			case 3:
				System.out.println("bye.");
				break;
			default:
				System.out.println("invalid:");
			}
		} while (isContinue);

	}

	public static String changeCase(String input) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = 0; i < input.length(); i++) {

			int ch = input.charAt(i);
			int val = (int) ch;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'o' || ch == 'U') {

				if ((int) ch > 64 && (int) ch < 91) {
					result = result + (char) (val + 32);
				}
				if ((int) ch >= 97 && (int) ch <= 128) {
					result = result + (char) (val - 32);
				}
			} 
			else {
				result = result + (char)ch;
			}
		}

	

	return result;

	}

	private static String vowel(String input) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E'
					|| input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U') {

				result = result + input.charAt(i);
			}

		}

		return result;
	}

	private static int menu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coice: 1. get vowel 2. Change case 3. Exit");
		int option = sc.nextInt();

		return option;
	}
}

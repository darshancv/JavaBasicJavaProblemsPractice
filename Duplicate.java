import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		toduplicate(input);
	}

	private static void toduplicate(String input) {
		// TODO Auto-generated method stub
		int frequency[] = new int[256];

		for (int i = 0; i < input.length(); i++) {
			frequency[(int) input.charAt(i)]++;
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != 0 && frequency[i] > 1 ) {
				System.out.println((char) i + " " + frequency[i]);
			}
		}
	}

}

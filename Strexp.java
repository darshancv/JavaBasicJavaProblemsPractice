import java.util.*;

public class Strexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String input = sc.nextLine();
		String result = "";
//String firstName="asdf";
		char ch;
//System.out.println();
//System.out.println(Byte.MAX_VALUE);
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
					ch = (char) (input.charAt(i) - 32);
					result = result + ch;

				} else {
					result = result + input.charAt(i);
				}

			} else {
				if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
					ch = (char) (input.charAt(i) + 32);
					result = result + ch;

				} else {
					result = result + input.charAt(i);
				}
			}

		}
		System.out.println(result);

	}

}

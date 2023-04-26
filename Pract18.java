import java.util.*;

public class Pract18 {
	public static String toUpperCase(String s) {
		String result = "";
		//String firstName="asdf";
		char ch;
		//System.out.println();
		//System.out.println(Byte.MAX_VALUE);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch = (char) (s.charAt(i) - 32);

			} else {
				ch = s.charAt(i);
			}
			result = result + ch;
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String s = sc.nextLine();
		System.out.println(toUpperCase(s));

	}

}

/*
 Diffrent methods can find error faster
 Organaised code
 code is more readable
 reusability
 Save Time
 Code size
 uderstandability
 Perform fast
 execution flow
 helps to remove duplicate methods
 Memory space
 good look
 */
 
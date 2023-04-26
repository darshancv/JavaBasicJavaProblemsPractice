import java.util.*;

public class Pract21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the usn: ");
		// String input = sc.nextLine();
		String input = "1DS09CS919";
		if (input.length() == 10) {

			if (input.charAt(0) == '1' || input.charAt(0) == '2') {

				if (input.charAt(1) >= 'A' && input.charAt(1) <= 'Z' && input.charAt(2) >= 'A'
						&& input.charAt(2) <= 'Z') {

					if (input.charAt(3) >= '0' && input.charAt(3) <= '9' && input.charAt(4) >= '0'
							&& input.charAt(4) <= '9') {

						if ((input.charAt(5) == 'C' && input.charAt(6) <= 'S')
								|| (input.charAt(5) == 'I' && input.charAt(6) <= 'S')
								|| (input.charAt(5) == 'E' && input.charAt(6) <= 'C')
								|| (input.charAt(5) == 'M' && input.charAt(6) <= 'E')) {
							if (input.charAt(7) >= '0' && input.charAt(7) <= '9' && input.charAt(8) >= '0'
									&& input.charAt(8) <= '9' && input.charAt(9) >= '0' && input.charAt(9) <= '9') {
								System.out.println("Success");
							} else {
								System.out.println("failure!!!");
							}
						}
					}
				}
			}
		}
	}

}

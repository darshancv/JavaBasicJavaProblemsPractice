import java.util.*;

public class Practcap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 read a string trim a string 2 read a string and reverse char in each word 3
		 * read 2-d array arrage in even and then odd and even convert it into 1-d array
		 * 
		 */
		boolean iscontinued = true;
		do {
			int option = getMenu();
			switch (option) {
			case 1:
				String result1 = toTrim();
				System.out.println(result1);
				System.out.println();
				break;
			case 2:
				String result2 = toReverse();
				System.out.println(result2);
				System.out.println();
				break;
			case 3:
				twodarray();
				break;
			case 4:
				System.out.println("End Thank You..!");
				iscontinued = false;
				break;
			default:
				System.out.println("invalid option!");
			}

		} while (iscontinued);

	}

	private static void twodarray() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row and column size of matrix:-");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter the elements of a matrix: ");
		int input[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		int result[][] = new int[row][col];

		int index1[] = new int[row * col];
		int index2 = 0;
		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (input[i][j] % 2 == 0) {

					index1[k] = input[i][j];
					k++;

				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (input[i][j] % 2 != 0) {
					index1[k] = input[i][j];
					k++;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = index1[count];
				count++;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}

		//Printing 
		System.out.println("1-D form:");
		for (int i = 0; i < index1.length; i++) {
			System.out.print(index1[i] + " ");

		}
		System.out.println();

	}

	private static String toReverse() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String input = sc.nextLine();
		String[] splited = toSplit(input);
		String result = "";
		for (int i = 0; i < splited.length; i++) {
			String store = splited[i];
			String temp = "";
			for (int j = store.length() - 1; j >= 0; j--) {
				temp = temp + store.charAt(j);

			}
			result = result + temp + " ";
		}
		return result;
	}

	private static String[] toSplit(String input) {
		// TODO Auto-generated method stub
		int index = 0;
		String temp = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				count++;
			}
		}
		String result[] = new String[count + 1];
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				temp = temp + input.charAt(i);
			}
			if (input.charAt(i) == ' ' || i == input.length() - 1) {
				result[index] = temp;
				temp = "";
				index++;

			}
		}
		return result;

	}

	private static String toTrim() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to trim:");
		String input = sc.nextLine();
		int start = 0;
		int end = input.length() - 1;
		String result = "";
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

	private static int getMenu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. Trim the String ");
		System.out.println("2. Reverse a String ");
		System.out.println("3. Two-d array operation");
		System.out.println("4. Exit"); 
		int option = sc.nextInt();

		return option;
	}

}

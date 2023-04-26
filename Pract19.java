import java.util.*;
public class Pract19 {
	public static String[] toSplit(String input) {
		String result[] = new String[10];
		int index = 0;
		String temp = "";
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  name 1: ");
		String input1 = sc.nextLine();

		System.out.println("Enter the  name 2: ");
		String input2 = sc.nextLine();

		String result1[]=toSplit(input1);
		String result2[]=toSplit(input2);
		
		
		String fstName=result1[0]+" "+result2[1];
		String secName=result2[0]+" "+result1[1];
		System.out.println(fstName+" "+secName);	
			
		
	}

}

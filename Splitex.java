import java.util.*;

public class Splitex {

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
		System.out.println("Enter the String : ");
		String input = sc.nextLine();

		String finalResult[]=toSplit(input);
		for(int i=0;i<finalResult.length;i++) {
			if(finalResult[i]!=null)
			{
				System.out.println(finalResult[i]);
			}
		}
		/*touppercase
		toLowercase
		split
		equalsingnorecase
		replace
		trim
		indexOf
		*/
		
		// ArrayList<String> splitedList =new ArrayList<String>();

		/*
		 * for (int i = 0; i < splitedList.size(); i++) {
		 * 
		 * System.out.println(splitedList.get(i) + " "); }
		 */

	}

}

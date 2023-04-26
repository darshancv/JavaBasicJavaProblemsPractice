import java.util.*;
public class Pract22 {
	public static String[] toSplit(String input) {
		
		int index = 0;
		String temp = "";
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
		}
		String result[]=new String[count+1];
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
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
String[] splited=toSplit(input);
String result="";
for(int i=0;i<splited.length;i++)
{
	String store=splited[i];
	System.out.println(store);
	String temp="";
	for(int j=store.length()-1;j>=0;j--) {
		temp=temp+store.charAt(j);
		
	}
	result=result+temp+" ";
}
System.out.println(result);

	}

}

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter a line:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String s1[]=new String[100];
		s1=s.split(" ");
		String s2="";
		for(int i1=0; i1<s1.length; i1++) {
			s2=s2+s1[i1];
		}
		System.out.println(s2);
	}

}

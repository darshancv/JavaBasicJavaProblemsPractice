import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter a line:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int count=0;
		String s1[]=new String[100];
		s1=s.split(" ");
		String s2="";
		for(int i1=0; i1<s1.length; i1++) {
			s2=s2+s1[i1];
		}
		char s3[]=new char[100];
		s3=s2.toCharArray();
		for(int i1=0; i1<s3.length; i1++) {
			System.out.println(s3[i1]);
			count++;
		}
	System.out.println(count);

	}

}

import java.util.*;
public class Noofwords {
	public static void main(String[] args) {
		String s;
		int count=0;
		System.out.println("Enter a line:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String s1[]=new String[100];
		s1=s.split(" ");
		for(int i1=s1.length-1; i1>=0; i1--) {
			System.out.print(s1[i1]+" ");
			count++;
		}
		System.out.println("\nNumber of words: "+count);
	}
}

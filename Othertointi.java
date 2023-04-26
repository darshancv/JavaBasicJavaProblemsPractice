import java.util.Scanner;

public class Othertointi {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the binary number:");
		String a=sc.nextLine();
		System.out.println("enter the octal number:");
		String b=sc.nextLine();
		System.out.println("enter the hexa number:");
		String c=sc.nextLine();

		Integer i=Integer.parseInt(a,2);
		Integer j=Integer.parseInt(b,8);
		Integer k=Integer.parseInt(c,16);
		
		System.out.println("integer to the binary number:"+i);
		System.out.println("integer to the octal number:"+j);
		System.out.println("integer to the hexa number:"+k);
		
		
	}

}

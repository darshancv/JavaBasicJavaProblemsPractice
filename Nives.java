import java.util.Scanner;

public class Nives {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0,sum=0;
		while(num!=0)
		{
			rem = num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(num%sum==0)
		{
			System.out.println("nives");
		}
		else {
			
			System.out.println("not");
					}
		

	}

}

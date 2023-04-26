import java.util.Scanner;

public class Missingno {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entr the value of n");
		int n=sc.nextInt();
		System.out.println("entr the numbers");
		int [] a=new int[n];
		for(int i=0;i<n-1;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			sum=sum+a[i];
			
		}
		int total=(n*(n+1))/2;
		int miss=total-sum;
		System.out.println("missing element is: "+miss);

	}

}

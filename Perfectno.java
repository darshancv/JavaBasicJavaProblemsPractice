import java.util.Scanner;

public class Perfectno {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int ne=num;
		int sum=0;
	
		for(int i=1;i<num;i++)
		{	
			if(num%i==0)
			{	
				sum=sum+i;
			}
		
		}
		
		if(sum==num)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not");
			
		}

	}

}

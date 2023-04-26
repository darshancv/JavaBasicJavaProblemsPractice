import java.util.Scanner;

public class Specialno {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int ne=num;
		while(num!=0)
		{
			int a=num%10;
			int fact=1;
			for(int i=1;i<=a;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==ne)
		{
			System.out.println("special");
		}
		else
		{
			System.out.println("not");
			
		}

	}

}


import java.util.*;
public class FindLargestNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Enter the number that you want to exclude in the above number:");
		int ex=sc.nextInt();
		for(int i=num-1; i>0; i--)
		{
			int rem, res=0, temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				if(rem!=ex) 
				{
					res=res*10+rem;
					temp=temp/10;
					continue;
				}
				else
					break;
			}
			int result=reverse(res);
			if(i==result)
			{
				System.out.println("The largest number excluding "+ex+ " is "+ i);
				break;
			}		
		}
	}
	
	static int reverse(int num) 
	{
		int rem, res=0;
		while(num!=0)
		{
			rem=num%10;
			res=res*10+rem;
			num/=10;
		}
		return res;
	}

}

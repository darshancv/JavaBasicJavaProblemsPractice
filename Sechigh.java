import java.util.*;
public class Sechigh {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entr the value of n");
		int n=sc.nextInt();
		System.out.println("entr the numbers");
		int [] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>=a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(a[n-2]==a[n-1])
		{
			System.out.println("the second largest element is:"+a[n-3]);
		}
		else
		{
			System.out.println("the second largest element is:"+a[n-2]);
		}
	}
}




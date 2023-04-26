import java.util.Scanner;

public class Distrinctcont {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		System.out.println("enter the numbers");
		int [] a=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)														
		{																		//this program counts the distrinct elements in array
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{	
		
			for(int j=0;j<n;j++)
			{
				if(i==j) 
				{
					temp++;
					
				}
				else if(a[j]==a[i])
				{
				
					break;	
				}
			
			}
			
		}
		System.out.println(temp);
	}

}

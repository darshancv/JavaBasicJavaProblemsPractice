import java.util.Scanner;

public class Reversarr {

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
						
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;

						
					}	
				}
				for(int i=0;i<n;i++)
				{
					System.out.println(a[i]);
				}
			}
	}



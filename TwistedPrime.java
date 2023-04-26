

public class TwistedPrime{
public static void main(String[] args) 
{
		int[] arr = new int[100];
		int ind=0;
		for(int i=2; i<=100; i++)
		{
			int flag=0;
			if(i==2 || i==3)
			{
				arr[ind]=i;
				ind++;
				
			}
			
			else
			{
				int t=0;
				for(int j=2; j<i; j++)
				{
					if (i%j!=0)
					{
						flag=1;
					}
					if(flag==1)
					{
						flag=0;
						continue;
					}
					else 
					{
						t=1;
						break;
					}
				}
				if(t==0)
				{
					arr[ind]=i;
					ind++;
				}
			}
		}
		
		for(int i=0; i<ind; i++)
		{
			int temp=arr[i];
			int rev=0, rem;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			primeOrNot(rev, arr[i]);
		}

	}
	
	static void primeOrNot(int num, int org)
	{
		int flag=0, t=0;
		if(num==2 ||num==3)
		{
			System.out.println(num);
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num%i!=0) 
				{
					flag=1;
				}
				if(flag==1) 
				{
					flag=0;
					continue;
				}
				else 
				{
					t=1;
					break;
				}
			}
			if(t==0) 
			{
				System.out.println(org);

			}
		}
	}

}

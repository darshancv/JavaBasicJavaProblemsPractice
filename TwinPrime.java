

public class TwinPrime {

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
		for(int i=0; i<=ind;i++)
		{
			if(arr[i+1]-arr[i]==2)
			{
				System.out.println("("+arr[i]+", "+arr[i+1]+")");
			}
		}

	}

}

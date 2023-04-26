
import java.util.*;

public class LeftZeroandRightOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		int b[]=new int[n], j=0, zCount=0, oCount=0;
		for(int i=0; i<n; i++)
		{
			if (arr[i]!=0 && arr[i]!=1)
			{
				b[j]=arr[i];
				j++;
			}
			else if(arr[i]==0)
				zCount++;
			else if(arr[i]==1)
				oCount++;
		}
		int len=b.length;
		for(int i=0; i<zCount; i++)
		{
			arr[i]=0;
		}
		for(int i=zCount, j1=0; j1<j; i++, j1++)
		{
			arr[i]=b[j1];
		}
		for(int i=(zCount+j); i<n; i++)
		{
			arr[i]=1;
		}
		System.out.println("Elements of the array after arranging:");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+"\t");
	}

}

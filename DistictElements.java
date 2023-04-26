import java.util.*;
public class DistictElements {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		System.out.println("enter the numbers");
		int [] a=new int[n];
		int temp, c=0;
		for(int i=0;i<n;i++)														
		{																		//this program counts the distrinct elements is array
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{	
			temp=0;
			for(int j=0;j<i;j++)
			{
				if(i==j) 
				{
					continue;
					
				}
				else if(a[j]==a[i])
				{
					temp++;
					break;	
				}
			
			}
			if(temp==0) {
				System.out.println(a[i]);
				c++;
				
			}
			
		}
		System.out.println("Elements are "+ c);
	}

}


/*
import java.util.HashMap; 
public class UniqueInArray2 { 

	public static void main(String args[]) 

	{ 
		int ar[] = { 10, 5, 3, 4, 3, 5, 6 }; 
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
		for (int i = 0; i < ar.length; i++) { 
			hm.put(ar[i], i); 
		} 
		// Using hm.keySet() to print output reduces time complexity.
		System.out.println(hm.keySet()); 

	} 

} 
*/

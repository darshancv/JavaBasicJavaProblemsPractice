import java.util.*;

public class Pract4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array: ");
int n=sc.nextInt();
System.out.println("enter the Elements of array");
int arr[]=new int[n];
int sum=0;
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	sum=sum+arr[i];
}
System.out.println("sum of the array: "+sum);


	}

}

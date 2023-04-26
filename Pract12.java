import java.util.*;
public class Pract12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter the length of array: ");
int n=sc.nextInt();
System.out.println("enter the Elements of array");
int a[]=new int[n];
for(int i=0;i<n;i++) {
a[i]=sc.nextInt();

}
for(int i=0;i<n;i++) {
	for(int j=i+1;j<n;j++)
	{
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(int i=0;i<n;i++) {
System.out.println(a[i]);

}







	}

}

import java.util.*;

public class Pract13 {

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
System.out.println("Enter the element to be searched: ");

int s=sc.nextInt();
int flag=0;
for(int i=0;i<n;i++) {
	if(a[i]==s) {
		flag=1;		
		break;
	}
	else {
		flag=0;
	}
}
if(flag==1) {
	System.out.println("True");
}
else {
	System.out.println("False");
	
}
	}

}

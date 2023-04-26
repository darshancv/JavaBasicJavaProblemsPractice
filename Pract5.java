import java.util.*;
public class Pract5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double a1[]= {10.0,20.0,30.0};
double a2[]= {20.0,50.0,30.0,70.0,80.0};
int n=a1.length > a2.length ? a1.length:a2.length;
double a3[]=new double[n];
for(int i=0;i<n;i++)
{
	if(a1.length>i) {
		a3[i]=a3[i]+a1[i];
	}
	if(a2.length>i) {
		a3[i]=a3[i]+a2[i];
	}

	System.out.println(a3[i]);
}

	}

}

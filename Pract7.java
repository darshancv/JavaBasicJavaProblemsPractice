import java.util.*;

public class Pract7 {
	static int GetMax(int a,int b,int c) {
		if(a>=b && a>=c) {
			return a;
		}
		else if(b>=a && b>=c) {
			return b;
		}
		else
		{
			return c;
		}
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("enter three numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int res=GetMax(a,b,c);
System.out.println(res);
	}

}

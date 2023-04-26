import java.util.*;
public class Fibo {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=0,c=1;
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}

	}

}

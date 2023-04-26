import java.util.*;
public class Practreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int temp=0;
int rev=0;
while(n!=0) {
	temp=n%10;
	rev=rev*10+temp;
	n=n/10;
	
}
System.out.println(rev);
	}

}

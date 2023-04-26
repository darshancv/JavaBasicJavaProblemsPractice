
import java.util.*;

public class ReplaceZeroWithFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt(), res=0, rem;
		while(num!=0) {
			rem=num%10;
			if(rem==0)
				rem=5;
			res=res*10+rem;
			num/=10;
		}
	
		int nNum=reverse(res);
		System.out.println("New number is "+nNum);
	}
	
	static int reverse(int num) {
		int rem, res=0;
		while(num!=0) {
			rem=num%10;
			res=res*10+rem;
			num/=10;
		}
		return res;
	}

}

import java.util.*;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long temp = 1;
		do {
			temp = temp * n;
			n--;
		} while (n > 0);
		System.out.println(temp);

	}

}

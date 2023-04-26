import java.util.*;

public class Practques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("two numbers: ");
		long n = sc.nextLong();
		long m = sc.nextLong();

		long res = n * m;
		long rem;
		int i = 0;
		long arr[] = new long[10];
		while (res >= 1) {
			rem = res % 2;
			arr[i] = rem;
			i++;
			res = res / 2;
			if (res == 1) {
				arr[i] = 1;
				break;
			}
		}
		int len = arr.length;
		System.out.print("Binary equivalent will be ");
		for (int j = len - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}

}

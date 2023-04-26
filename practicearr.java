import java.util.Scanner;

public class practicearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a1[] = { 12.3, 14.6, 13.2, 17.9 };
		double a2[] = { 15.1, 18.3, 16.1 };
		int n = a1.length > a2.length ? a1.length : a2.length;
		double a3[] = new double[n];
		for (int i = 0; i < n; i++) {
			if (a1.length > i) {
				a3[i] = a3[i] + a1[i];
			}
			if (a2.length > i) {
				a3[i] = a3[i] + a2[i];
			}
		}

		int arr[] = new int[n];

		for (int j = 0; j < a3.length; j++) {
			double temp = a3[j] % (int) a3[j];
			if (temp > 0.5) {
				int store = (int) a3[j] % 10;

				arr[j] = (int) a3[j] + store;
			} else {
				int store1 = (int) a3[j] % 10;

				arr[j] = (int) a3[j] - store1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int help = arr[i];
					arr[i] = arr[j];
					arr[j] = help;
				}

			}

		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}

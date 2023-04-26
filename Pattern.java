
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 5; i >= 1; i--) {
			int n = 5;

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}

			System.out.println();
		}
	}
}

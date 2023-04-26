
public class PatPractice {

		public static void main(String[] args) {
			int temp=0;
			 for (int i = 4; i >= 1; i--)
		        {
		            for (int j = 4; j >= i; j--)
		            {
		                System.out.print(j + " ");
		                temp =j;
		            }
		            for (int k = 4 - i+1; k < 4; k++)
		            {
		                System.out.print(temp + " ");
		            }
		            System.out.println();
		        }
			 
	}
}

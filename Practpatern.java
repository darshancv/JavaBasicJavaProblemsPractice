
public class Practpatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int k=0;k<5;k++)
		{
			for(int j=0;j<5;j++)
			{
				if(k==j || j==0 || k==0) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}

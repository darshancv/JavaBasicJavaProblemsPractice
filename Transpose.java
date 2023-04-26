import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entr the value of n");
		int n=sc.nextInt(); 
		System.out.println("entr the value of m");
		int m=sc.nextInt();
		int [][] a=new int[n][m];
		int [][] b=new int[m][n];
		System.out.println("entr the values");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[j][i]=a[i][j];
			}
		
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}


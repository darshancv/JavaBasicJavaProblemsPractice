import java.util.*;
public class Star {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)%2==0)
						{
							System.out.print("*");
						}
				System.out.print(" ");
			}
		
			System.out.println();
	}

}
}
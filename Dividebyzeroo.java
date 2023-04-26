import java.util.Scanner;

public class Dividebyzeroo {

	public static void main(String[] args) {
		int c = 0;
		try 
		{   
			Scanner s=new Scanner(System.in);
			
			int a=s.nextInt();
			int b=s.nextInt();
			c=a/b;
	
		}
		catch (Exception e)
		{
			System.out.println("/ by zero");
			return;
		}
		
		System.out.println(c);
	}

}

import java.util.Scanner;

class Bz extends Exception{
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 0;

	}
}
class Cc extends Exception{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
public class Texp {

	public static void main(String[] args) {
	System.out.println("enter the age");
	Scanner sc=new Scanner(System.in);
	int age =sc.nextInt();
	
		if(age<=0)
		{
			try 
			{
				throw new Bz();
			}
			catch (Bz e)
			{
				System.out.println(e.hashCode());
			}
		}	
		else if(age>20)
		{	
			try 
			{
				throw new Cc();
			}
			catch (Cc e1)
			{
				System.out.println(e1.hashCode());
			}
		}
		/*else
		{
			System.out.print("age is valid");
		}*/
}

}



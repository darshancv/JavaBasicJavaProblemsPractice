
public class PerfectSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=36;
		while(i<=n/i)
		{
			if(i*i==n)
			{
				System.out.println("perfect square");
				break;
			}
			else
			{
				System.out.println("not perfect square");
				break;
			}
		}
	}

}

class Res
{
	 void display()
	{
		try {
			
				for(int i=1;i<=10;i++)
				{
					
					System.out.println(Thread.currentThread());
					System.out.println(4*i);
					Thread.sleep(1000);
				}
			}
		catch (InterruptedException e)
		{
		
				e.printStackTrace();
		}
		
	}
}
class M extends Thread
{
	Res s;
	M(Res r)
	{
		s=r;
	}
	public void run()
	{
		s.display();
	}
}
class N extends Thread
{
	Res s;
	N(Res r)
	{
		s=r;
	}
	public void run()
	{
		s.display();
	}
}
public class Withsyncro {

	public static void main(String[] args) {
	Res rs=new Res();
	M i= new M(rs);
	N o= new N(rs);
	i.start();
	o.start();
	

	}

}

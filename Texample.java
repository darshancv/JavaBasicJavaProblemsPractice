class Hello extends Thread{

	public void run() {
		for(int i=0;i<5;i++)
		{	try
			{
				System.out.println("hello");
			
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
	
				e.printStackTrace();
			}
			
		}
		
	}
	
}
class Hi extends Thread{

	public void run() {
		for(int i=0;i<5;i++)
		{	try
			{
				System.out.println("hi");
			
				Thread.sleep(1000);
			
			}
			catch (InterruptedException e) 
			{
	
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}




public class Texample {

	public static void main(String[] args) {
		Hello a = new Hello();
		Hi b = new Hi();
		a.start();
		b.start();
	}

}


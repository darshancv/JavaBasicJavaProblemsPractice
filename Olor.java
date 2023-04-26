class C{
	void print(int a,int b)
	{
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		
	}
	void print(int a,int b,int c)
	{
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		System.out.println("value of a is:"+c);
		
	}
	void show()
	{
		System.out.println("hello");
	}
}
class B extends C{
	void show()
	{
		System.out.println("hi");
	}
}
public class Olor {

	public static void main(String[] args) {
		C a=new C();
		B b=new B();
		a.print(1, 2);
		a.print(1, 2, 3);
		a.show();
		b.show();
	}

}


public class Rotationarr {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int x=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=x;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}

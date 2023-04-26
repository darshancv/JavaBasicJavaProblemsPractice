import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Colldemoarr {

	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		Scanner sc=new Scanner(System.in);
	//	a.add(sc.nextInt());
		a.add(1);
		a.add(55);
		a.add(7);
		Collections.sort(a);
		//System.out.println(a.get(0));
		if(a.contains(1))
		{
			Collections.replaceAll(a,1,0);
			//System.out.println("yes");
		}
		Collections.reverse(a);
		Iterator i=a.iterator(); 
		while(i.hasNext())
		{
			System.out.println(i.next());
			//System.out.println(i);	
		}
		//System.out.println(a);
		//System.out.println());
		
	}

}

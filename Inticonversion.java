import java.util.Scanner;
import java.lang.*;
public class Inticonversion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the integer:");
		
		int b=sc.nextInt();
		Integer object=new Integer(b);
		String a=object.toBinaryString(b);
		String c=object.toHexString(b);
		String d=object.toOctalString(b);
		Short f=object.shortValue();
		byte g= (byte) b;
		long h=object.longValue();
		float i=object.floatValue();
		double j=object.doubleValue();
		
		System.out.println("binary: "+a);
		System.out.println("hexa: "+c);
		System.out.println("octa: "+d);
		System.out.println("short: "+f);
		System.out.println("byte: "+g);
		System.out.println("long: "+h);
		System.out.println("float: "+i);
		System.out.println("double: "+j);
		
		
		
	}

}

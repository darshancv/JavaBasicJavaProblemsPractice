import java.util.*;
public class Pract11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the figure type:1 for triangle 2 for square and 3 for rectangle 4 for circle: ");
int o=sc.nextInt();
int s;
int h;
int area=0;
if(o==1) {
	System.out.println("enter side and hieght length: ");
	s=sc.nextInt();
	h=sc.nextInt();
	area=1/2*s*h;
	System.out.println("area of triangle is:" +area);
}
else if(o==2) {
	System.out.println("enter side length: ");
	s=sc.nextInt();

	area=s*s;
	System.out.println("area of square is:" +area);
}else if(o==3) {
	System.out.println("enter width and hieght length: ");
	s=sc.nextInt();
	h=sc.nextInt();
	area=s*h;
	System.out.println("area of rectangle is:" +area);
}
else if(o==4){
	System.out.println("enter radius: ");
	s=sc.nextInt();
	
	area=22/7*s*s;
	System.out.println("area of circle is:" +area);
}
else {

	System.out.println("Enter the correct figure option!!!!");
}
}
	}


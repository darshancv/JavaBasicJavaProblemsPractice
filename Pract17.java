import java.util.*;
public class Pract17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++) {
	if(Character.isUpperCase(s.charAt(i))) {
		System.out.print(s.charAt(i));
	}
}
	}

}

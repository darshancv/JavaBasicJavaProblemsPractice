import java.util.StringTokenizer;
public class Strbuff {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("my name is khan"); 
		sb.reverse();
		System.out.println(sb);
		StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	     while (st.hasMoreTokens()) {  
	 
	         System.out.println(st.nextToken());  

	}

}
}
  

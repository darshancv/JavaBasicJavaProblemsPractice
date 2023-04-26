import java.util.Scanner;

public class Fibtriangle {

	public static void main(String[] args) {
		int a=0,b=1,i=0,c,j=0; 
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		for(i=1; i<=n; i++)    
		{    

	        a=0;    

	        b=1;    

	       System.out.print(b+" ");  

	        for(j=1; j<i; j++)    
	        {    

	            c=a+b;    

	          System.out.print(c+" ");    

	            a=b;    

	            b=c;  

	        }   

	        System.out.println();   

	    }    

  
	

	}

}
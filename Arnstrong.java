import java.util.Scanner;

public class Arnstrong {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		 int c=0,a,temp;  
		    
		    temp=num;  
		    while(num>0)  
		    {  
		    a=num%10;  
		    num=num/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  

	}



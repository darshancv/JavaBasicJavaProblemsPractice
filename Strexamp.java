import java.util.Scanner;

public class Strexamp {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter a line:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine(); 
		int count=0;
		char[] s1=new char[100];
		s1=s.toCharArray();
		for(int i1=0; i1<s1.length; i1++)
		{	
			int temp=0;
			for(int j1=0; j1<i1; j1++)
			{
				
				if(i1==j1) 
				{
					continue;
				
				}
				else if(s1[j1]==s1[i1])
				{
					temp++;
					break;	
				}

			}
			if(temp==0)
			{
				System.out.print(s1[i1]);
			}

		}

	}

}

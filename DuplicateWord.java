
import java.util.*;
public class DuplicateWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String sArr[]=str.split(" ");
		int len=sArr.length;
		for(int i=0; i<len; i++) 
		{
			int count=1;
			for(int j=i+1; j<len; j++) 
			{
				if(sArr[i].equals(sArr[j]) && !(sArr[j].equals(" ")))
				{
					count++;
					//sArr[j]=" ";
				}
			}
			if(count>1) 
			{
				System.out.println(sArr[i]+" is the duplicate element and repeats "+ count+ " times");
			}
		}
	}

}

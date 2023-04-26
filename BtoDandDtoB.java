
import java.util.*;
import java.math.*;

public class BtoDandDtoB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
			System.out.println("1.Binary to Decimal\n2.Decimal to Binary\n3.Exit");
			int ch;
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the binary number:");
						int binary=sc.nextInt();
						BtoD(binary);
						break;
				case 2: System.out.println("Enter the Decimal number:");
						int decimal=sc.nextInt();
						DtoB(decimal);
						break;
				case 3: return;
						default: System.out.println("Please enter correct choice!!!");
			}        
		}
	}
	static void BtoD(int bin) 
	{
		int pow=0, rem, digit=0;
		while(bin!=0)
		{
			rem=bin%10;
			digit=(int) (rem*(Math.pow(2, pow)))+digit;
			pow++;
			bin=bin/10;
		}
		System.out.println("Decimal equivalent will be "+digit+"\n");
	}
	static void DtoB(int dec) 
	{
		int rem, i=0;
		int arr[]=new int[10];
		while(dec>=1)
		{
			rem=dec%2;
			arr[i]=rem;
			i++;
			dec=dec/2;
			if(dec==1)
			{
				arr[i]=1;
				break;
			}
		}
		int len=arr.length;
		System.out.print("Binary equivalent will be ");
		for(int j=len-1; j>=0; j--) 
		{
			System.out.print(arr[j]);
		}
		System.out.println("\n");
	}

}

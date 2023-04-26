import java.util.*;

public class Pract39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		arr[i][j]=sc.nextInt();
	}
}
int temp=0;
	for(int j=0;j<3;j++) {
		temp=temp+arr[0][j];
	}
int temp1=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
		temp1=temp1+arr[i][j];
		}
		if(temp==temp1) {
			
		}
	}

	}

}

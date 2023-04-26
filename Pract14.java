import java.util.*;

public class Pract14 {
	public static boolean findElement(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < arr[mid])
				high = mid - 1;
			else if (key == arr[mid])
				return true;
			else
				low = mid + 1;
		}

		return false;
	}

	public static boolean findString(String names[], String name) {
		int low=0;
	
	int high=names.length-1;
	
	while(high >=low) {
		
		int mid=(low+high/2);
		int res=name.compareTo(names[mid]);
	
		if(res==0) {
			return true;
			
		}
		
		if(res<0) {
			high=mid-1;
			
		}
		else{
			low=mid+1;
		}
	}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 8, 5, 6, 7 };
		boolean res1=findElement(arr,9);
		String names[]= {"ali","abc","dddd","asdfsadf"};
		boolean res2=findString(names,"ali");
		System.out.println(res2);
		if(res1==true) {
		System.out.println("key found");
		}else {
			System.out.println("key not found");
		}
		if(res2==true) {
			System.out.println("key found");
		}else {
			System.out.println("key not found");
		}
	}

}

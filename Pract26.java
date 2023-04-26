import java.util.Scanner;

public class Pract26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Item arr[]=new Item[3];
arr[0]=new Item(01,100);
arr[1]=new Item(02,150);
arr[2]=new Item(03,200);

boolean iscontinued = true;
do {
	int option = getMenu();
	switch (option) {
	case 1:
		
		 System.out.println(
		            "item  data in item arr are: ");
		 for (int i = 0; i < arr.length; i++) {

		        arr[i].display();
			
		}
		System.out.println();
		break;
	case 2:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item id:");
		int item_id=sc.nextInt();
		float result2 =search(arr,item_id); 
		System.out.println(result2);
		System.out.println();
		break;
	case 3:
		System.out.println("End Thank You..!");
		iscontinued = false;
		break;
	default:
		System.out.println("invalid option!");
	}

} while (iscontinued);


	}

	private static float search(Item[] arr, int item_id) {
		// TODO Auto-generated method stub
		float result=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			if(arr[i].id==item_id)
			{
				System.out.println("enter the quantity of the item:");
				int quantity=sc.nextInt();
				result=quantity * arr[i].price;
			}
			else {
				System.out.println("item not found...!");
			}
		}
		
		return result;
	}

	private static int getMenu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. Display the list ");
		System.out.println("2. Search for item ");
		System.out.println("3. Exit"); 
		int option = sc.nextInt();

		return option;
	
	}

}
class Item{
	public int id;
	public float price;
	public Item(int id, float price) {
		super();
		this.id = id;
		this.price = price;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+price);
		
	}
	
	
	
	
}
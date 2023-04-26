import java.util.*;
public class Subarray1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int[] a = {1,2,3,4,5};
        
        /*for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }*/
        scan.close();
        
       // int numNegativeSubarrays = 0;
        int sum = 0; 
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++) 
            { 
                 
                for(int k = i; k <= 3; k++)
                {
                    sum = sum + a[k];
                }
                
              
            }
        }
        System.out.println(sum);
       // System.out.println(numNegativeSubarrays);
    }
}
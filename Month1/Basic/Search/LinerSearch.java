import java.util.*;

public class LinerSearch {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // input in array
        int arr[]  = new int[size];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");

        int target = sc.nextInt();

        // linear search
        for(int i=0; i<size; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;     
            }
        }
        
        System.out.println("Element not found");
    }
}

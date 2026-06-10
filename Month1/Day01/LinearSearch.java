import java.util.*;

public class LinearSearch{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the size of an array - ");
        int size = sc.nextInt();

        //Enter the array element
        int arr[] = new int[size];

        System.out.println("Enter the element of an array - ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value that need to be searched in an array - ");
        int target = sc.nextInt();

        // Linear Search
        boolean found = false;

        for(int i=0; i<size; i++){
            if(arr[i] == target){
                System.out.println("Target found at " + i);
                found = true;
                break;
            } 
        }

        if(!found){
            System.out.println("Target not found in an array");
        }

        sc.close();
    }
}
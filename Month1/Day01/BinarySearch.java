import java.util.*;

public class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Size - ");
        int size = sc.nextInt();

        System.out.println("Enter the array Element - ");
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched - ");
        int target = sc.nextInt();

        
        // arr = [1 2 3 4 5 7 9 10], target ->  7
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while(left <= right){
            int mid = (left + right) / 2;
            // mid = 4; 7 > 4
            if(arr[mid] == target){
                System.out.println("Element fount at " + mid);
                found = true;
                break;
            } else if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }

        sc.close();
    }
}
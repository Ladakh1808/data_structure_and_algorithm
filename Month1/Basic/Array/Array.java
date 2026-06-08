import java.util.*;

public class Array {
    public static void main(String args[]){
        // int[] marks = new int[5];

        // marks[0] = 100;
        // marks[1] = 90;
        // marks[2] = 80;

        // // System.out.println(marks[0]);
        // for (int mark : marks){
        //     System.out.println(mark);
        // }

        // User Input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int marks [] = new int[size];


        // input in array
        for(int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

        // output in array
        for(int mark:marks){
            System.out.println(mark);
        }

    }
}

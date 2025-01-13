/*
        Enter the Size of Array : 
        5
        5 4 3 2 1
        [5, 4, 3, 2, 1]
        Enter the Position you want to Delete :
        3
        [5, 4, 2, 1, 0]
 */

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementAtPos_Array_2 {

    static void deleteElementAtPositionInArray(int[] arr, int pos) {

        for (int i = pos - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the Position you want to Delete : ");
        int pos = sc.nextInt();

        deleteElementAtPositionInArray(arr, pos);

        System.out.println(Arrays.toString(arr));
    }
}

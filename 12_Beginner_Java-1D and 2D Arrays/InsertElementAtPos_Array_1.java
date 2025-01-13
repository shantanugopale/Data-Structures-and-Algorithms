/*
        Enter the Size of Array : 
        5
        [0, 0, 0, 0, 0, 0]
        5 4 3 2 1
        [5, 4, 3, 2, 1, 0]
        Enter the Position which you wannna insert the Element..:- 
        4 
        Enter the Element..:- 
        9
        [5, 4, 3, 9, 2, 1]
 */

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtPos_Array_1 {

    static void insertElementAtPositionInArray(int[] arr, int pos, int element) {
        for (int i = arr.length - 2; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = element;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the Position which you wannna insert the Element..:- ");
        int pos = sc.nextInt();
        System.out.println("Enter the Element..:- ");
        int element = sc.nextInt();
        if (pos > arr.length) {
            System.out.println("Invalid Input");
        } else {
            insertElementAtPositionInArray(arr, pos, element);
        }

        System.out.println(Arrays.toString(arr));
    }
}

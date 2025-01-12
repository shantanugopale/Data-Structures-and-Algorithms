/*
    Enter the Size of Array : 
    5
    7 6 5 4 3
    [7, 6, 5, 4, 3]
    Enter the Element you want to Search : 
    5
    Element is Found at index 2
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_SearchElementReturnIndex_8 {

    static Scanner sc = new Scanner(System.in);

    static int searchElement(int element, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    static void insertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        insertArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Element you want to Search : ");
        int element = sc.nextInt();
        int index = searchElement(element, arr);
        if (index == -1) {
            System.out.println("Element is not Present..");
        } else {
            System.out.println("Element is Found at index " + index);
        }

    }
}

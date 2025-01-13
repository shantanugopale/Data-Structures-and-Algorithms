/*
        Enter the Check element :
        3
        2 4 7 8
 */

import java.util.Scanner;

public class ReturnIndex_RepeatingElements_Array_3 {

    static void checkReapeatElement(int[] arr, int element) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{1, 2, 3, 4, 3, 5, 7, 3, 3};

        System.out.println("Enter the Check element : ");
        int element = sc.nextInt();
        checkReapeatElement(arr, element);

    }
}

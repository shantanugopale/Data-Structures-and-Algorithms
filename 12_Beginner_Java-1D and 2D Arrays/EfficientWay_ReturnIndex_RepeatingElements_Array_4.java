/*
        Enter the Element to Check and Return Index : 
        3
        0 2 5 7
 */

import java.util.Scanner;

class EfficientWay_ReturnIndex_RepeatingElements_Array_4 {

    static int[] efficientWayReturnIndexOfRepeatingElement(int[] arr, int element) {

        int n = arr.length;

        int[] output = new int[n + 1];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                output[j] = i;
                j++;
            }
        }
        output[j] = -1;
        return output;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{5, 6, 7, 2, 7, 3, 7, 4};

        System.out.println("Enter the Element to Check and Return Index : ");
        int element = sc.nextInt();

        int[] output = efficientWayReturnIndexOfRepeatingElement(arr, element);

        for (int i = 0; output[i] != -1; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

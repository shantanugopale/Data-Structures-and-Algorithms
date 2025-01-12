/*
    Enter the Binary
    111001
    The Result is : 57
 */

import java.util.Scanner;

class BinaryToDecimal_5 {

    static int binaryToDecimal(int N) {
        int ans = 0;
        int p = 1;
        while (N != 0) {
            int lastBit = N % 10;
            ans = ans + lastBit * p;
            p = p * 2;
            N = N / 10;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary");

        int result = binaryToDecimal(sc.nextInt());
        System.out.println("The Result is : " + result);
    }
}

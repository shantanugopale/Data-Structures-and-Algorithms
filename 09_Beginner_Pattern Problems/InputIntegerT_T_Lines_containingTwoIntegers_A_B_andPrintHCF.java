/*  Q. Write a Program to niput an integer T and then T lines each containing  two integers A & B from user and print T lines containing HCF   of two given 2 numbers A and B.*/

import java.util.Scanner;

class InputIntegerT_T_Lines_containingTwoIntegers_A_B_andPrintHCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer T :");
        int T = sc.nextInt();
        int hcf = 0;
        for (int i = 1; i <= T; i++) {
            System.out.println("Enter A :");
            int A = sc.nextInt();
            System.out.println("Enter B :");
            int B = sc.nextInt();

            for (int j = 1; j < Math.min(A, B); j++) {
                if (A % j == 0 && B % j == 0) {
                    hcf = j;
                }
            }
            System.out.print(": HCF is : " + hcf);
            System.out.println();
        }
    }
}

// Given 2 No's a and n print a^n.

import java.util.Scanner;

class Given2No_A_N_PrintAPowerN {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number : ");
            int a = sc.nextInt();
            System.out.println("Enter the Number of Time : ");
            int n = sc.nextInt();

            int i = 1;
            int res = 1;
            while (i <= n) {
                res = res * a;
                i++;
            }
            System.out.println("Result :" + res);
        }

    }
}

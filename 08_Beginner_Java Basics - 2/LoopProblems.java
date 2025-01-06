
import java.util.Scanner;

public class LoopProblems {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Write a loop to Print 
            System.out.println(" 1> All Numbers from N to 1");
            System.out.println("Enter the Number : ");
            int N1 = sc.nextInt();
            while (N1 >= 1) {
                System.out.print(N1 + " ");
                N1--;
            }
            System.out.println();
            System.out.println("-------------------------------------------------------");

            System.out.println(" 2> All Even Numbers from 1 to N");
            System.out.println("Enter the Number : ");
            int N2 = sc.nextInt();
            // int i1 = 0;
            int i1 = 2;
            while (i1 <= N2) {
                // if (i1 % 2 == 0) {
                //     System.out.print(i1 + " ");
                // }
                // i1++;
                System.out.print(i1 + " ");
                i1 = i1 + 2;
            }
            System.out.println();
            System.out.println("-------------------------------------------------------");

            System.out.println(" 3> Sum of All Numbers from 1 to N");
            System.out.println("Enter the Number ");
            int N3 = sc.nextInt();
            int i2 = 1;
            int sum1 = 0;
            while (i2 <= N3) {
                sum1 = sum1 + i2;
                i2++;
            }
            System.out.println("Sum of All Numbers from 1 to N is : " + sum1);
            System.out.println();
            System.out.println("-------------------------------------------------------");

            System.out.println(" 4> Sum of All ODD Numbers from 1 to N");
            System.out.println("Enter the Number : ");
            int N4 = sc.nextInt();
            int i3 = 1;
            int sum2 = 0;
            while (i3 <= N4) {
                if (i3 % 2 != 0) {
                    sum2 = sum2 + i3;
                }
                i3++;
            }
            System.out.println("Sum of All ODD Numbers is : " + sum2);
            System.out.println();
            System.out.println("-------------------------------------------------------");

            System.out.println(" 5> Print all Multiples of 4 from 1 to N");
            System.out.println("Enter the Number : ");
            int N5 = sc.nextInt();
            int i4 = 1;
            while (i4 <= N5) {
                if (i4 % 4 == 0) {
                    System.out.print(i4 + " ");
                }
                i4++;
            }
            System.out.println();
            System.out.println("-------------------------------------------------------");

            System.out.println(" 6> Print Powers of 2 from 1 - 100");
            System.out.println("Enter the Number :");
            int N6 = sc.nextInt();
            int i5 = 1;
            while (i5 <= N6) {
                System.out.println(i5);
                i5 = i5 * 2;
            }
        }
    }
}

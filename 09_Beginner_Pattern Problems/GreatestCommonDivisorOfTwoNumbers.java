
import java.util.Scanner;

class GreatestCommonDivisorOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1'st Number : ");
        int A = sc.nextInt();   // 20
        System.out.println("Enter the 2'nd Number :");
        int B = sc.nextInt();   // 12
        int gcd = 0;
        for (int i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The GCD is : " + gcd);
    }

}

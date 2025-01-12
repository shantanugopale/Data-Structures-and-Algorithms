
// Long Division Euclid's Algorithm for GCD
import java.util.Scanner;

public class FindGCD_EuclidAlgo_1 {

    static int GCD(int A, int B) {
        while (A != 0) {        // for( ; A != 0 ;)
            int a__ = B % A;
            int b__ = A;
            A = a__;
            B = b__;
        }
        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1'st Number : ");
        int A = sc.nextInt();
        System.out.println("Enter 2'nd Number : ");
        int B = sc.nextInt();

        System.out.println(GCD(A, B));
    }
}

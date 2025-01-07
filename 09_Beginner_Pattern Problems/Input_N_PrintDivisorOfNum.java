
import java.util.Scanner;

class Input_N_PrintDivisorOfNum {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number : ");
            int N = sc.nextInt();
            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    // Count How many Number's are Divisors
                    System.out.print(i + " ");
                    cnt++;
                }
            }
            System.out.println();
            System.out.println("Total Divisors " + cnt + " of this Number");
        }
    }
}

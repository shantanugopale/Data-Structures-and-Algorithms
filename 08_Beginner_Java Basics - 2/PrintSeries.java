
import java.util.Scanner;

// Q. Given a series of form 3i + 2, print first N terms.
public class PrintSeries {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter N : ");
            int N1 = sc.nextInt();

            int i1 = 1;
            while (i1 <= N1) {
                System.out.println((3 * i1) + 2);
                i1++;
            }

            // Q. Given a series of form 3i + 2, which are not Multiple of 5
            System.out.println("Enter N : ");
            int N2 = sc.nextInt();

            int i2 = 1;
            while (i2 <= N2) {
                int res = (3 * i2) + 2;
                if (res % 5 != 0) {
                    System.out.println("Series with Not Multiple of 5 : " + res);
                }
                i2++;
            }
        }
    }
}

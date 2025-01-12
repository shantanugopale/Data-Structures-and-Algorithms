/* Two Funcions 1'st GCD() find, and 2'nd GCDOfN() which send input to GCD() and add it result which overrites and sends back overwritten result with next no to GCD() function when Specified Inputs Condition ends then return the Answer.*/

 /*
    Enter the No of Inputs : 
    5
    Enter the Elements : 
    10 20 40 12 6
    GCD of N Elements is : 2
 */
import java.util.Scanner;

public class FindGCD_MultipleInputs_2 {

    static int gcd(int x, int y) {

        for (; x != 0;) {
            int x__ = y % x;
            int y__ = x;
            x = x__;
            y = y__;
        }
        return y;
    }

    static int GCD_Of_N() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Inputs : ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements : ");
        int ans = sc.nextInt();

        for (int i = 1; i <= n - 1; i++) {
            int no = sc.nextInt();
            ans = gcd(ans, no);
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = GCD_Of_N();
        System.out.println("GCD of N Elements is : " + result);
    }
}

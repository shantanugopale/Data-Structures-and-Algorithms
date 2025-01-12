/*
    Enter the Decimal No : 
    57
    The Result is : 111001
 */
import java.util.Scanner;

public class DecimalToBinary_6 {

    static void DecimalToBinary(int n) {
        int ans = 0;
        int p = 1;
        while (n != 0) {
            ans = ans + (n % 2) * p;
            p = p * 10;
            n = n / 2;
        }
        System.out.println("The Result is : " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal No : ");
        int n = sc.nextInt();

        DecimalToBinary(n);
    }
}

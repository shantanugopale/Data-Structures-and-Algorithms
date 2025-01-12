// First Find GCD of This 2 Inputs, and Apply Formula which is LCM(x,y) = (x * y) / GCD(x, y)

/*
    Enter the Multiply Element : 
    10
    Enter the Number : 
    12
    GCD is : 2
    LCM is : 60
 */
import java.util.Scanner;

public class FindLCM_usingFormulaEfficientWay_4 {

    static int GCD(int A, int B) {
        while (A != 0) {        // for( ; A != 0 ;)
            int a__ = B % A;
            int b__ = A;
            A = a__;
            B = b__;
        }
        return B;
    }

    static int LCM(int element, int num, int GCDResult) {
        return (element * num / GCDResult);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Multiply Element : ");
        int element = sc.nextInt();

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int GCDResult = GCD(element, num);
        System.out.println("GCD is : " + GCDResult);
        int LCMResult = LCM(element, num, GCDResult);
        System.out.println("LCM is : " + LCMResult);
    }
}

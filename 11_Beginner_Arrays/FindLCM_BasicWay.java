// Basic way to find Least Common Multiple

/* 
    Enter the Multiply Element : 
    10
    Enter the Number : 
    12
    LCM is : 60
 */
import java.util.Scanner;

public class FindLCM_BasicWay {

    static int LCM(int element, int num) {
        int i = 1;

        while (true) {
            int check = num * i;
            if (check % element == 0) {
                return check;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Multiply Element : ");
        int element = sc.nextInt();

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int result = LCM(element, num);
        System.out.println("LCM is : " + result);
    }
}

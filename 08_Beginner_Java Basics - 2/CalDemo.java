
import java.util.Scanner;

class CalDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int cal = 0;
        while (cal < n) {
            System.err.println("Running 1 Step " + (cal + 1));
            cal++;
        }
        System.out.println("Cal is : " + cal);
        System.out.println("Target Achieved Take Rest.......!!!");
        sc.close();
    }
}

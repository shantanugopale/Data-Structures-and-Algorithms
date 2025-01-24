
import java.util.Scanner;

class CheckSumOfPairOfElementsPrint_1 {

    static void CheckSumOfPairOfElements(int sum, int[] myArr) {
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 1; j < myArr.length; j++) {
                if (myArr[i] + myArr[j] == sum) {
                    System.out.println("Pair of Elements are : " + myArr[i] + " and " + myArr[j] + " = " + sum);
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sum to Check : ");
        int n = sc.nextInt();

        int[] arr = {1, 4, 45, 6, 10, 8, 8, 12};

        CheckSumOfPairOfElements(n, arr);

    }
}

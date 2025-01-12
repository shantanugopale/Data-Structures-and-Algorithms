
import java.util.Scanner;

public class ArrayTraverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + "");
        }
    }
}

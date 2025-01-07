
import java.util.Scanner;

class PrintAllOddNoFrom1_N {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the N :");
            int N = sc.nextInt();

            for (int i = N; i >= 0; i--) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}

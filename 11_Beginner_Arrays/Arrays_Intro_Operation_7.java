
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Intro_Operation_7 {

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ar));

        int[] marks = new int[6];

        printArray(marks);

        System.out.println();

        System.out.println("Enter the Elements : ");
        for (int i = 0; i < marks.length; i++) {
            int no = sc.nextInt();
            marks[i] = no;
        }

        printArray(marks);

    }
}

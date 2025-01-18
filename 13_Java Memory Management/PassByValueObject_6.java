
public class PassByValueObject_6 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        printArray(a);
        System.out.println();
        System.out.println(a);

    }
}

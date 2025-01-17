
import java.util.Arrays;

class PrimitivesVsObjects_3 {

    public static void main(String[] args) {

        // Primitive data type
        int a = 10;
        int b = a;
        a = 20;
        System.out.println("a: " + a + " b: " + b);

        // Object data type
        int[] x = {10, 20, 30};

        System.out.println(Arrays.toString(x));

    }
}

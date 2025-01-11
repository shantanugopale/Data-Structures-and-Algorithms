
public class CompoundAssignmentOperator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int add = x += y;
        int sub = x -= y;
        int mul = x *= y;
        int div = x /= y;
        int mod = x %= y;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

    }
}

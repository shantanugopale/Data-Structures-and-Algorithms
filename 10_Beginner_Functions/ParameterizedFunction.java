
public class ParameterizedFunction {

    public static void doWork(String work) {
        System.out.println(work);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void BankSal(String name, String salary) {
        System.out.println("Hello " + name + ", Salary " + salary + " Credited");
    }

    public static void main(String[] args) {

        doWork("CODING");
        greet("SHANTANU");
        BankSal("SHANTANU DNYANESHWAR GOPALE", "236598273491");
        greet("XYZ");
    }
}

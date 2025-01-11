
public class FunctionUsingReturnKeyword {

    static double shoppingCard(int amount) {
        int apple = 560;
        int bread = 340;
        int bananas = 90;
        // double remainingAmount = amount - apple - bread - bananas;
        // return remainingAmount;
        return amount - apple - bread - bananas;
    }

    public static void main(String[] args) {

        double res = shoppingCard(1200);

        System.out.println("REMAINING AMOUNT :" + res);
    }
}

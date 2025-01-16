/*
        1000
        2000
        [10, 12, 1000, 2000, 15, 20, 25, 30, 35, 40, 45, 50]
        [10, 12, 2000, 15, 20, 25, 30, 35, 40, 45, 50]
        10, 2000, 15, 20, 25, 30, 35, 40, 45, 50,
        Enter Number to be removed:
        1000
        [10, 2000, 15, 20, 25, 30, 35, 40, 45, 50]
 */

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClasses_6 {

    public static void main(String[] args) {

        // Wrapper Classes
        // ArrayList only understands data in the form of objects
        // So, we need to convert primitive data types to objects
        // This is done using Wrapper Classes
        // Wrapper Classes are classes that convert primitive data types to objects
        // Also called Autoboxing
        // Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        Integer x = 10; // More Powerful as it contains Behaviour
        int y = 12;
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(x);
        arrList.add(y); // Autoboxing

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        arrList.add(num1);
        arrList.add(num2);

        arrList.add(15);
        arrList.add(20);
        arrList.add(25);
        arrList.add(30);
        arrList.add(35);
        arrList.add(40);
        arrList.add(45);
        arrList.add(50);

        System.out.println(arrList);

        arrList.remove(2);
        System.out.println(arrList);

        arrList.remove(Integer.valueOf(y));

        for (Integer z : arrList) {
            System.out.print(z + ", ");
        }

        System.out.println();
        // contains
        System.out.println("Enter Number to be removed: ");
        Integer num3 = sc.nextInt();
        while (arrList.contains(num3)) {
            arrList.remove(num3);
        }

        System.out.println(arrList);

    }
}

// Wrapper
// add
// set
// get
// remove

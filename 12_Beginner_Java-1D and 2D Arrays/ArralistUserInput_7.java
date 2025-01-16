
/*
        Enter How Many Elements you wants to Insert : 
        3
        Enter Element : 
        3
        Enter Element : 
        2
        Enter Element : 
        1
        [3, 2, 1]
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArralistUserInput_7 {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Elements you wants to Insert : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element : ");
            Integer num = sc.nextInt();
            arrList.add(num);
        }

        System.out.println(arrList);
    }
}

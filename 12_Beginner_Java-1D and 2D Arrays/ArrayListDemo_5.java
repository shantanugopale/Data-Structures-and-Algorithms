
import java.util.ArrayList;

class ArrayListDemo_5 {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(1000);

        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(2);

        System.out.println(arrList);

        // insert in the middle
        arrList.add(2, 100);
        System.out.println(arrList);

        // update the value
        arrList.set(3, 88);
        System.out.println(arrList);

        // get the value
        System.out.println(arrList.get(4));

        // iterate the ArrayList
        for (Integer a : arrList) {
            System.out.print(a + " ");
        }
        System.out.println();
        // another way
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
        //  arrList.trimToSize(); // trim the size of the ArrayList to the number of elements

    }
}

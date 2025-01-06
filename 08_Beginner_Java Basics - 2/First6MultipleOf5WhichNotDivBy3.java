
public class First6MultipleOf5WhichNotDivBy3 {

    public static void main(String[] args) {

        int i = 1;
        int cnt = 0;
        while (i <= 100 && cnt < 6) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + " ");
                cnt++;
            }
            i++;
        }
    }
}

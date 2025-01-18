
class PassByValueDemo_5 {

    static void modify(int a) {
        a = a + 10;
    }

    public static void main(String[] args) {

        int a = 10;
        modify(a);
        System.out.println(a);

    }
}


class Alaram {

    int current_time;
    int start_time;

    Alaram(int current_time) {
        this.current_time = current_time;
    }

    void setTime(int start_time) {
        this.start_time = start_time;
    }

    void start() {
        while (true) {
            if (current_time == start_time) {
                System.out.println("Wake up");
                break;
            } else {
                System.out.println("Sleeping");
                break;
            }
        }
    }
}

class AlaramTest_4 {

    public static void main(String[] args) {
        // Alaram alaram = new Alaram(10);
        Alaram alaram = new Alaram(9);
        alaram.setTime(10);
        alaram.start();
    }
}

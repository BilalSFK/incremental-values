package Q1;

    public class Test {
        public static void main(String[] args) {
            int x = 1;
            int y = 1;

            if (x++ < ++y) {
                System.out.print("hello");
            } else {
                System.out.print("welcome");
            }
            System.out.println("Log" + x + ":" + y);

        }
    }

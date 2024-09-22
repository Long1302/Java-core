public class ForIndexDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        //in ra so chan 1->10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }

        // cach toi uu hon
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("i = " + i);
        }

        // in 10->1
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }
    }
}

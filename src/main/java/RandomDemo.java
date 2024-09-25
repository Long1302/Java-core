import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // tao ra 1 so int ngau nhien
        int a = random.nextInt();
        System.out.println("a = " + a);

        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // min <= ? <= max
        // min <= min + random.nextInt(max - min + 1) <= max
        int c = random.nextInt(100, 999);
        System.out.println("c = " + c);

        // random 1 phan tu trong mang
        String[] fruits = {"cam", "tao", "oi", "le", "dua"};
        int fruitIndex = random.nextInt(fruits.length);
        String fruit = fruits[fruitIndex];
        System.out.println("fruit = " + fruit);

    }
}

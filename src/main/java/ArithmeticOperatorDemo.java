public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        // +, - , *, /, %
        int a = 100;
        int b = 10;

        // Lay ra 3 chu so cuoi cua phep tinh
        int c = 100214 % 1000; // chia lay ra so du
        System.out.println("c = " + c);

        //+=, -=, *=, /=, %=
        a = a + 10;
        // tuong duong
        a += 10;
        System.out.println("a = " + a);

        //
        int d = b++; // d = b => b = b + 1
        System.out.println("d = " + d);
        int e = ++b; // b = b + 1 => e = b
        System.out.println("e = " + e);
    }
}

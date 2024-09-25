public class OutPutDemo {
    public static void main(String[] args) {
        // Escape character
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> xuong dong
        // \t -> tab

        // System.out.print();
        System.out.print("\"java\" core\n");
        System.out.print("\"java\" core\n");

        // System.out.println();
        System.out.println("\"java\" core");

        // System.out.printf();
        // %d : so nguyen
        // %f : so thuc
        // %s : String
        // %c : ky tu(char)
        // %n : xuong dong
        String name = "khoa";
        int age = 30;
        System.out.printf("Ten cua ban la: %s, tuoi cua ban la: %d%n", name, age);
        // can le
        System.out.printf("| %8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abcabcabc");
        //lam tron so
        System.out.printf("PI = %.2f%n", 3.1415);
        // nhom 3 so
        System.out.printf("Money = %,f%n", 1234560000.78);
        // In hoa
        // %S, %C
        System.out.printf("Ten: %S%n", "khoa");
    }
}

public class ArrayDemo {
    public static void main(String[] args) {
        //c1 khai bao mang
        int[] numbers = {1, 2, 3, 4, 5};
        //c2 khai bao mang
        String[] names = new String[]{"khoa", "my", "long"};

        // mang co gia tri mac dinh la 5
        int[] array = new int[5];

        // kich thuoc cua mang
        System.out.println("numbers.length = " + numbers.length);

        // Truy cap dua theo index
        System.out.println("names[1] = " + names[1]);
        //lay ra phan tu cuoi cung cua mang
        System.out.println("names[names.length] = " + names[(names.length - 1)]);

        //lap cac phan tu trong mang
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();
        //lap cac phan tu trong mang tu phai qua trai
        for (int i = numbers.length; i >= 1 ; i--) {
            System.out.println("i = " + i);
        }

    }
}

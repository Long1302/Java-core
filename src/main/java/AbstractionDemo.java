public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        // 1. Không thể khởi tạo đối tượng trừu tượng (từ abstract class)
        //   Animal animal = new Animal();

        // 2. Class con phải là abstract hoặc phải triển khai method của class cha
        Cat cat = new Cat();
        cat.makeSound();

        // 3. Abstract có thể không có abstract menthod nào
    }
}

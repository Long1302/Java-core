import Entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập
        // public: Có thể truy cập được từ mọi nơi
        Dog dog1 = new Dog();
        dog1.age = 3;
        System.out.println("dog1.age = " + dog1.age);

        // protected: Có thể truy cập đuược trong cùng package
        // default: Có thể truy cập đuược trong cùng package


        // private: Chỉ có thể truy cập được trong cùng 1 class
    }
}

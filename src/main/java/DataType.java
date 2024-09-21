public class DataType {
    public static void main(String[] args) {
        //cu phap khoi tao bien
        // [kieu_du_lieu] [ten_bien] = gia tr khoi tao

        // kieu so nguyen: byte(1), short(2), int(4), long(8)
        int age = 18;
        System.out.println("age = " + age);

        //kieu so thuc: float(4), double(8)
        float pi = 3.141592653589793f;
        double PI = 3.141592653589793;
        System.out.println("pi = " + pi);
        System.out.println("PI = " + PI);

        //kieu logic: boolean
        boolean isLoading= true;
        System.out.println("isLoading = " + isLoading);

        //kieu ky tu: char(2)
        char c = 'A';
        System.out.println("c = " + c);

        //kieu xau ky tu: String
        String name= "long";
        System.out.println("name = " + name);

        //kieu enum
        Gender gender = Gender.MALE;
        System.out.println("gender = " + gender);

        //Class & Object
        Dog dog1 = new Dog();
        dog1.name = "Mun";
        dog1.age = 1;
        dog1.gender = Gender.MALE;
        dog1.bark();
        int result = dog1.sum(1, 3);
        System.out.println("result = " + result);

        Dog dog2 = new Dog();
        dog2.name = "Muc";
        dog2.age = 5;
        dog2.gender = Gender.FEMALE;
        dog2.bark();
    }
}

public class Department {
    int id;
    String name;

    Department(){
        System.out.println("Constructor khong tham so");
    }

    Department(String name){
        System.out.println("Constructor 1 tham so");
        this.id = 99;
        this.name = name;
    }

    Department(int id, String name){
        System.out.println("Constructor 2 tham so");
        this.id = id;
        this.name = name;
    }
}

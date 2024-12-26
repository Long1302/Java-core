public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Không có kiểu dữ liệu trả về
        // 2. Tên phải trùng vs tên class

        Department department = new Department(1, "Bao ve");
        System.out.println("department.id = " + department.id);
        System.out.println("department.name = " + department.name);

        Department d = new Department();
        System.out.println("d.id = " + d.id);
        System.out.println("d.name = " + d.name);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói
        // 1. Thêm private cho tất cả thuộc tính
        // 2. Truy cập thông qua getter hoặc setter

        Student student = new Student("Khoa");
        System.out.println("student.getName() = " + student.getName());
        student.setName("Duc");
        System.out.println("student.getName() = " + student.getName());

        System.out.println("student = " + student);
    }
}
package entity;

public class Program04 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setScore(5);
        student.showInfo();
        student.plusScore(2);
        student.showInfo();
    }
}

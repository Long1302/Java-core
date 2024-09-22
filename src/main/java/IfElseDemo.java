public class IfElseDemo {
    public static void main(String[] args) {
        int month = 1;
        if (month % 2 == 0){
            System.out.println("Thang co 30 ngay");
        }else if (month % 2 == 1){
            System.out.println("Thang co 31 ngay");
        }else {
            System.out.println("khong biet");
        }
    }
}

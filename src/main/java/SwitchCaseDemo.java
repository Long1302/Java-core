public class SwitchCaseDemo {
    public static void main(String[] args) {
        int month = 1;

        switch (month){
            case 1:
                System.out.println("co 31 ngay");
                break;
            case 2:
                System.out.println("co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("khong biet");
                break;
        }
    }
}

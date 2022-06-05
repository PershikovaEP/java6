import ru.netology.java6.java6.services.SQRService;

public class main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int a = service.numberSqr(150, 250);
        System.out.println("количество квадратов в диапозоне " + a);
    }
}

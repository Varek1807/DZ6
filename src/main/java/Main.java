import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int actual = service.boundaryValues(1000, 100);
        System.out.println("Итого " + actual + " квадрата/ов чисел от 10 до 99 попали в диапазон");

    }

}

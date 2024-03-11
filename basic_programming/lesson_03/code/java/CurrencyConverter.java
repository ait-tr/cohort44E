package lesson3;

//сверху класса обычно расположены импорты(загрузка) дополнительных библиотек
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        start();
    }

//    Введите трехзначное число:

    public static void start() {
        System.out.println("Приветствуем в CurrencyConverter!\n" +
                "\n" +
                "Выберите исходную валюту:\n" +
                "1.EURO\n" +
                "2.USD\n" +
                "3.TL");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String currency;
        if (number == 1) {//проверяется соответствие нашего number на 1
            currency = "1.EURO";
        }
        else if (number == 2) {
            currency = "2.USD";
        }
        else if (number == 3) {
            currency = "3.TL";
        }
        else {// Если предыдущие условия не подошли, то это
            currency = number + " такой валюты нет в списке.";
        }
        System.out.println("Вы выбрали " + currency);
        scan.close();
    }
}

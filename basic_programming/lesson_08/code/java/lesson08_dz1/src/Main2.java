import java.util.Scanner;

/*
Дан массив чисел, например double[]. Например, этот массив содержит показатели температуры.
Ваша программа должна определить есть ли в этом массиве значения меньше заданной величины и,
если есть, выдать сообщение на экран.
 */
public class Main2 {
    public static void main(String[] args) {
        double[] array = {1.5, 7.2, 4.4, 8.5, 9.0, 1.0, 16.2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        double number = scanner.nextDouble();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                System.out.println("Найдено значение меньше" + number);
                break;
            }
        }
    }
}

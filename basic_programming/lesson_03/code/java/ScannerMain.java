package lesson3;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String line = scanner.nextLine();// Прочитай следующую строку.
        System.out.println("Вы ввели строку: " + line);

        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();// Прочитай следующую строку числом.
        System.out.println("Вы ввели целое число:  " + num);

        scanner.close();
    }

}
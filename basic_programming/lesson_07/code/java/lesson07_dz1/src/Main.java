/*
Пользователь вашей программы вводит 2 целых числа num1 и num2.
Если num1 больше num2 программа выводит все числа начиная от num1 до num2.
Если num1 меньше num2 программа выводит все числа начиная от num2 до num1.
Если num1 равно num2 программа выводит один раз это число.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1: ");
        int num1 = scanner.nextInt();
        System.out.println("Input number2: ");
        int num2 = scanner.nextInt();

         int max = Math.max(num1,num2);  //   int max = num2>num1 ? num2:num1;
         int min = Math.min(num1,num2);  //   int min = num2>num1 ? num1:num2;

        int currentNum = max;
        while (currentNum>=min){
            System.out.println(currentNum);
            currentNum = currentNum-1;
        }

        // -------------------------------------------------
        System.out.println("------------------------------------------------------");
        for (currentNum=max; currentNum>=min; currentNum=currentNum-1){
            System.out.println(currentNum);
        }




    }
}
import java.util.Scanner;
/*
Пользователь вашей программы вводит два числа: num1 и num2. Ваша программа
должна вывести все элементы массива, значение которых лежит в диапазоне от
nun1 до num2 и сосчитать их количество.
 */
public class Main {
    public static void main(String[] args) {

        int[] array = {9,12,-1,76,7,8,99,5,3,7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Input number 2:");
        double num2 = scanner.nextDouble();
        System.out.println("Диапазон: "+ num1 +"   " +num2);

        int counter=0;
        for (int i=0; i<array.length; i++){
            if (array[i]>=num1   && array[i] <= num2   ) {
                System.out.print("[" + i + "]:" + array[i] + "  ");
                counter++;
            }
        }
        System.out.println();
        System.out.println("-------------");
        System.out.println(counter);
    }
}
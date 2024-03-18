/*
Допустим дан массив имен, например, заданный так:
String[] names = {"Jack", "John", "Vlad", "Alex"};
- Написать метод void printArray(String[] array), который выводит на экран весь массив
- Написать метод int calcSum (String[] array), который возвращает сумму символов во всех именах данного массива
- Написать метод int calcNamesByChar (String[] array, char ch), который возвращает количество имен в массиве, начинающихся на заданную букву
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jack", "John", "Vlad", "Alex", "Andrey", "Nickolaus"};
        printArray(names);
        int sum= calcSum(names);
        System.out.println(sum);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ для поиска: ");
        String str= scanner.nextLine();
        System.out.println(      calcNamesByChar(names,  str.charAt(0)  )    );
    }

    public static void printArray(String[] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] +"    ");
        }
        System.out.println();
    }

    public static int calcSum (String[] array){
        int result = 0;
        for (int i = 0; i<array.length; i++){
            result = result + array[i].length();
        }

        return result;
    }

    public static int calcNamesByChar (String[] array, char ch){
        int count=0;
        for (int i=0; i<array.length; i++){
            if ( ch == array[i].charAt(0) ){
                count++;
            }
        }
        return count;
    }


   // public static int calcNamesByChar (String[] array, char ch)
//  calcNamesByChar(array, "h") error
//  calcNamesByChar(array, 8.2) error
//  calcNamesByChar('a', array) error
//  calcNamesByChar(array, 'a')

}
/*
Пользователь вводит строку:

String str = scanner.nextLine();

или, можно просто задать строку в переменной.
Ваша программа должна посчитать, сколько в этой строке пробелов.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String str = scanner.nextLine();

        int spaceCounter = 0;

        for (int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch==' '){
                spaceCounter++;
            }
        }


        System.out.println(str);
        System.out.println("There are " + spaceCounter + " spaces");
    }
}
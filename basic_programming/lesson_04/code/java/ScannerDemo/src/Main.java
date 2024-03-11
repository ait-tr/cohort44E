import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Input number 1:");
       int num1 = scanner.nextInt();
       System.out.println("Input number 2:");
       int num2 = scanner.nextInt();

       // ----------------------------------------------------------------


       //                  10+20 =  30
       System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
    }
}
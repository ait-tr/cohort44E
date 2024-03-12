import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input num1:");
        int num1=scanner.nextInt();

        System.out.println("Input num2:");
        int num2=scanner.nextInt();

        System.out.println("Input num3:");
        int num3=scanner.nextInt();

        System.out.println("------------------------------------------------------");
        System.out.println("num1 = " + num1 + "  num2 = " + num2 + "  num3 = " + num3) ;

        if (num1>num2){
            if(num1>num3){
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else {
            if(num2>num3){
                System.out.println(num2);
            } else{
                System.out.println(num3);
            }
        }


    }
}
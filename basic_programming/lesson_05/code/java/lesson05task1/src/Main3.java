import java.util.Scanner;

public class Main2 {
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

        int max = num1;
        /*
        if (max<num2) {
            max = num2;
        } else {
            max=max;
        }

        if(max<num3){
            max=num3;
        }


         */

        //  value  =   условие ? значение если true : значение если false ;

        max = (max<num2) ? num2 : max;
        max = (max<num3) ? num3 : max;


        System.out.println(max);

    }
}


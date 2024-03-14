import java.util.Scanner;

public class Main3 {
    // возведение в степень
    // 2^3 = 2*2*2
    //       -----
    //         3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1: ");
        int num1 = scanner.nextInt();
        System.out.println("Input number2: ");
        int num2 = scanner.nextInt();

        //---------------------------------------------
        int result=1;
        for (int counter = num2; counter>0; counter--){
            result = result* num1;
        }


        /*
        2,4
        (1) 1 * 2 = 2
        (2) 2 * 2 = 4
        (3) 4 * 2 = 8
        (4) 8 * 2 = 16

         */




        //--------------------------------------------
        System.out.println(num1+"^"+num2+"="+result);

    }

}

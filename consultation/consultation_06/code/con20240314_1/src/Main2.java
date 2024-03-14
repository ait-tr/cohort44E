import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();

        int saveNum = num;

        while ( num>=0   ) {
            System.out.println("hi: " + num);
            num--;  //counter=counter-1;
        }
        System.out.println("counter after while:" + num);

        num =saveNum;

        // ------
        System.out.println("---------- for --------------");

        for (  ; num>=0   ; num-- ){
            System.out.println("hi: " + num);
        }



        System.out.println("counter after while:" + num);

    }
}
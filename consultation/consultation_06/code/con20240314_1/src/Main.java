import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = scanner.nextInt();

        int counter = num;

        while ( counter>0   ) {
            System.out.println("hi: " + counter);
            counter--;  //counter=counter-1;
        }
        System.out.println("counter after while:" + counter);

        // ------
        System.out.println("---------- for --------------");

        for ( counter = num  ; counter>0   ; counter-- ){
            System.out.println("hi: " + counter);
        }

        System.out.println("counter after while:" + counter);

    }
}
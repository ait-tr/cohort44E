import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number or 0 for exit: ");
        int num = scanner.nextInt();
        int sum=num;

        while (num!=0 && sum <100){
            System.out.println("Summa: " + sum + "  Input number or 0 for exit: ");
            num = scanner.nextInt();
            sum = sum+num;
        }
        System.out.println("------------------------");
        System.out.println("Result: " + sum);


    }

}

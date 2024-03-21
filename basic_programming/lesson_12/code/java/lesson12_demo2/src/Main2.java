import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("----------- while");
        int a=3;
        while (a>0){
            System.out.println(a--);
        }

        System.out.println("----------- do .... while");
        a=3;
        do {
            System.out.println(a--);
        } while (a>0);

        //System.out.println(addNumbers1());
    }

    public static int addNumbers1(){
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        System.out.println("Введите число или 0 для выхода:");
        int number = scanner.nextInt();

        while (number!=0){
            sum=sum+number;
            System.out.println("Введите число или 0 для выхода:");
            number = scanner.nextInt();
        }
        return sum;
    }

    public static int addNumbers2(){
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        int number = 0;
        do{
            sum=sum+number;
            System.out.println("Введите число или 0 для выхода:");
            number = scanner.nextInt();
        }while (number!=0);
        return sum;
    }



}

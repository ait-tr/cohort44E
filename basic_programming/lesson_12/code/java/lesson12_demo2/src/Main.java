import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш выбор:");
        System.out.println("'1' - приветствие");
        System.out.println("'2' - песня");
        System.out.println("'3' - спорт");
        System.out.println("'4' - музыка");


        int choice = scanner.nextInt();

        switch (choice){
            case 3: sport(); break;
            case -1:
            case 0:
            case 1: greeting(); break;
            case 2: song(); break;
            case 4: music(); break;
            default:
                System.out.println("-----------------");
        }





        /*
        char key='a';
        switch (key){
            case '1': greeting(); break;
            case 'a': song(); break;
            case 'b': sport(); break;
            case '4': music(); break;
            default:
                System.out.println("-----------------");
        }
        */
/*
        if(choice==1){
            greeting();
        } else if (choice==2){
            song();
        } else if (choice==3) {
            sport();
        } else if (choice==4) {
            music();
        } else {
            System.out.println("-----------------");
        }
*/

    }
    public static void greeting(){
        System.out.println("Hello! I am glad to see you!");
    }
    public static void song(){
        System.out.println("la-la-la");
    }

    public static void sport(){
        System.out.println("jump and run!");
    }

    public static void music(){
        System.out.println("I'll take my guitar....");
    }

}
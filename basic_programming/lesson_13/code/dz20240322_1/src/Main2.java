import java.util.Scanner;

public class Main2 {

    /*

    #2
    Написать следующую программу: пользователь вводит номер месяца, система выдает название сезона (зима, весна, лето, осень).
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.print("Enter the month of the year  -> ");
            choice = scanner.nextInt();

            String strMonth= getSeasonTitle(choice);
            System.out.println(strMonth);
        } while (choice>=1 && choice<=12);
    }
    public static String getSeasonTitle(int monthNumber) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: return "Winter";
            case 3:
            case 4:
            case 5: return "Spring";
            case 6:
            case 7:
            case 8: return "Summer";
            case 9:
            case 10:
            case 11:return "Autumn";

            default:
                return "Invalid choice";
        }
    }

}

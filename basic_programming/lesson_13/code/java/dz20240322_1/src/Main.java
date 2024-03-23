import java.util.Scanner;

public class Main {

    /*
    #1
    Написать следующую программу: пользователь вводит номер месяца, система выдает название месяца.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.print("Enter the month of the year  -> ");
            choice = scanner.nextInt();

            String strMonth= getMonthTitle(choice);
            System.out.println(strMonth);
        } while (choice>=1 && choice<=12);
    }
    public static String getMonthTitle(int monthNumber) {
        switch (monthNumber) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10:return "October";
            case 11:return "November";
            case 12:return "December";
            default:
                return "Invalid choice";
        }
    }
    // новый синтаксис switch .... case
    public static String getMonthTitle1(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid choice";
        };
    }

    public static String getMonthTitle2(int monthNumber) {
        int errTitle=0;
        String[] monthTitles = { "Invalid choice","January","February","March"
                ,"April","May","June","July","August"
                ,"September","October","November","December"};
         return (monthNumber>=1 && monthNumber<=12)? monthTitles[monthNumber] : monthTitles[errTitle];
        };

}

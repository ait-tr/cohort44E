import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = inputInt("Input day:", scanner);
        int month = inputInt("Input month:", scanner);
        int year = inputInt("Input year:", scanner);

        if (isDateCorrect(day, month, year)){
            System.out.println(dateToString(day, month, year));
        } else {
            System.out.println("date is not correct");
        }





    }

    private static boolean isDateCorrect(int day, int month, int year) {
        return isYearCorrect(year) && isMonthCorrect(month) && isDayCorrect(day, month, year);
    }

    private static boolean isDayCorrect(int day, int month, int year) {
        return day>=1 &&  day<=getDayPerMonth(month,year);
    }

    private static int getDayPerMonth(int month, int year) {
        switch (month){
            case 1: return 31;
            case 2: return 28 + ( isYearLeap(year)?1:0 );
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0;
    }

    private static boolean isYearLeap(int year) {
        /*
        Отсюда следует распределение високосных годов:

            год, номер которого кратен 400, — високосный;
            остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
            стальные годы, номер которых кратен 4, — високосные[6];
             все остальные годы — невисокосные.
         */


        return (year % 400 == 0) || ( (year % 4 == 0) && (year % 100 != 0) );
    }

    private static boolean isMonthCorrect(int month) {
        return month>=1 && month <=12;
    }

    private static boolean isYearCorrect(int year) {
        return year>0;
    }

    public static String dateToString(int day, int month, int year){
        return day +"/" + month + "/" + year;
    }

    public static int inputInt(String msg, Scanner scanner){
        System.out.println(msg);
        return scanner.nextInt();
    }



}

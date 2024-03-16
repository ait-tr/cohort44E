public class Main2 {

    public static void main(String[] args) {
        double a=10;
        double number = 5.3;

        System.out.println( sum(a, 9.0 , number));
        System.out.println( sum(1, 1.7 , 2));
        System.out.println( sum(number, number , number));
        System.out.println( sum(  sum(2,2,2)        , number , number));

        System.out.println(monthName(1));
        printStringWithBrackets("hello");
        monthName(2);

    }

    public static String monthName(int month){
        System.out.println(" hello from method");
            if (month==1){
                return "Январь";
            } else if (month == 2){
                return "Февраль";
            } else {
                return "-";
            }

    }

    public static void printStringWithBrackets(String str){
        System.out.println("[" + str + "]");
    }


    public static double sum(double a, double b, double c){
            return   a+b+c;
    }

}

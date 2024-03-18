public class Main {
    public static void main(String[] args) {

       String str = "Hello Java";
        System.out.println(str.length()); // длинна строки
        System.out.println(str.charAt(0)); // символ по индексу
        System.out.println(str.substring(0,3)); // "Hel"  первый включая, последний нет
        System.out.println(str.substring(2,3)); // "l"  первый включая, последний нет
        System.out.println(str.substring(3)); // "lo Java"  первый включая, последний нет
        /// System.out.println(str.substring(1,100));   // !!! error StringIndexOutOfBoundsException

        if (str.equals("Hello Java")){
            System.out.println("строки равны");
        }
        System.out.println("--------------------------------------");

        String s1="hello";
        String s2= "hello";
        String s3= s1.substring(0,2)+s2.substring(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase("HeLLO"));

        String str2= "QWerTY".toLowerCase();
        System.out.println(str2);
        String str3= "QWerTY".toUpperCase();
        System.out.println(str3);

        if (str2.endsWith("ty")){}
        if(str2.startsWith("qwe")){}

        char[] array = str.toCharArray(); // получить массив из букв строки

// Name:Andrey, age:20,

    }

    public static String[] method(int a){

    }

}
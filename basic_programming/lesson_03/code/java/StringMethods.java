package lesson3;

public class StringMethods {

    public static void main(String[] args) {

        /**
         * Многострочный комментарий
         */
        // однострочный комментарий

        int num = 5;
        double d = 1.5;
        char c = 'A';

        String hello = "Hello";
        String world = "World";
//        Конкатенация (слияние) - +
//        Если + используется со строками, это конкатенация, а не математическое сложение
        System.out.println(hello + world); //HelloWorld
        System.out.println(hello + d); //Hello1.5
        System.out.println(hello + " " + c);//Hello A
        System.out.println(world + num); //World5
        System.out.println("Hello " + world); //Hello World

        String str = "мама мыла РАМУ";
        int lengthString = str.length(); //это возвращает нам длину строки (число букв)
        System.out.println(lengthString);//6
        char letter = str.charAt(0); //метод возвращает символ из строки по указанному индексу (от 0)
        System.out.println(letter);//s
        int index = str.indexOf("i");
        System.out.println(index);//3
        //меняет строку на нижний ригистр
        System.out.println(str.toLowerCase());//мама мыла раму
        //меняет строку на верхний ригистр
        System.out.println(str.toUpperCase());//МАМА МЫЛА РАМУ
        boolean contains = str.contains("мыла");//Метод который проверяет содержит ли наша строка посдстроку "мыла"
        System.out.println(contains);//true
        boolean equals = str.equals("мама мыла");//Метод который проверяет равенство строк
        System.out.println(equals);//false
    }
}

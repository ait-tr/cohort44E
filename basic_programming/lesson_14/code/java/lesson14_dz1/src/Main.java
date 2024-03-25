import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        MyDate date1 = new MyDate(20,2,2021);
        MyDate date2 = new MyDate(25,4,2022);
        MyDate date3 = new MyDate(9,5,2024);
        MyDate date4 = new MyDate(19,5,2024);


       // System.out.println( dateToString(date1)  );
       // System.out.println( dateToString(date2)  );

        MyDate[] array = {date1, date2, date3, date4, new MyDate(8,12,2000)};

        for (int i = 0; i < array.length; i++) {
            System.out.println( array[i]  );
        }

        Person p1 = new Person("Иван", "Иванов", date1);
        Person p2 = new Person("Федя", "Федоров", date2);
        Person p3 = new Person("Николай", "Федоров", new MyDate(10,10,1998));


        System.out.println(p1);
        System.out.println(p2);




    }











}
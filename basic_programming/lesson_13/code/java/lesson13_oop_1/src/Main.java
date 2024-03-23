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
            System.out.println( toString(array[i])  );
        }

        Person p1 = new Person("Иван", "Иванов", date1);
        Person p2 = new Person("Федя", "Федоров", date2);
        System.out.println(toString(p1));
        System.out.println(toString(p2));


    }

    public static String toString(MyDate date){
        return date.day +"/" + date.month + "/" + date.year;
    }

    public static String toString(Person person){
        return person.firstName + " " + person.lastName + " " + toString(person.birthday);
    }


}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
            new Person("Jack", 20),
            new Person("Nick", 24),
            new Person("Ann", 19),
            new Person("John", 10)
       ));

        System.out.println(people);

        Comparator<Person> comparator1 = new ComparatorByAge();

        Comparator<Person> comparator2 = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };

        /*
        class QWER implements Example{
        new Example(){

            @Override
            public void method1() {
                System.out.println("hello1");
            }

            @Override
            public int method2() {
                return 10;
            }
        };
        }
        Example e = new QWER();
         */

        Example e= new Example(){

            @Override
            public void method1() {
                System.out.println("hello1");
            }

            @Override
            public int method2() {
                return 10;
            }
        };


        /*

        class XXXX13234 implements Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };

        Comparator<Person> comparator2 = new XXXX13234();


         */




        Collections.sort(people, comparator1);
        System.out.println(people);


        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Collections.sort(people, (Person o1, Person o2) -> { return o1.getName().compareTo(o2.getName());}    );
        Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName())    );



    }
}
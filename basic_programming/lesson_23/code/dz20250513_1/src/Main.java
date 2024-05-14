/*

Дан лист <Person>. Необходимо написать метод, который возвращает
List<String> который содержит имена всех пользователей старше 20 лет

Дан List<Person>. Необходимо написать метод, который вернет, сколько раз заданный
Person встречается в данном листе.

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person lookingPerson1 = new Person("Ann", 22);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", 20));
        //people.add(new Person("Ann", 22));
        people.add(lookingPerson1);
        people.add(new Person("John", 24));
        people.add(new Person("Ed", 19));
        people.add(new Person("Mike", 18));
        people.add(new Person("Ann", 22));
        people.add(new Person("Nick", 26));
        people.add(new Person("Ed", 19));
        people.add(new Person("Alice", 23));
        people.add(new Person("Ann", 22));
        // -------------------------------------------------------------------------

        System.out.println(people);
        System.out.println(PersonUtil.getNamesOfPersonOlderThan(people,20));


        Person lookingPerson2 = new Person("Ed", 19);

        System.out.println(lookingPerson1 + " встречается " + PersonUtil.count(lookingPerson1,people) + " раз");
        System.out.println(lookingPerson2 + " встречается " + PersonUtil.count(lookingPerson2,people) + " раз");


    }



}
/*
Дан список Person, написать метод, который проверит есть ли в этом списке заданный Person

Дан список Person, написать метод, который проверит есть ли в этом списке Person с заданным email
 */

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(  new Person("Jack","j1980@mail.com", 10),
                new Person("John","john@mail.com", 20),
                new Person("Jack", "jack@mail.com",10),
                new Person("Jack", "j145@mail.com",10),
                new Person("Jack","j145@mail.com", 10),
                new Person("Lena","lena@mail.com", 20),
                new Person("Anna","anna@mail.com", 19)
        );

        System.out.println(find(people,"j146@mail.com"));
        System.out.println(people);


    }


    public static boolean find(List<Person> list, Person findPerson){
        return list.indexOf(findPerson)>=0;
    }

    public static boolean find(List<Person> list, String email){
        Optional<Person> find = list.stream()
                .filter(p -> p != null && p.getEmail().equals(email))
                .findAny();
            return find.isPresent();

    }





}
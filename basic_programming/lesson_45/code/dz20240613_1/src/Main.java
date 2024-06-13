/*
Дан список Person (String firstName, String lastName, int age).
Необходимо используя стрим реализовать метод, который вернет список String,
где в алфавитном порядке будут перечислены все ФИО людей (в виде И.Иванов) старше 18 лет.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static List<String> getNamesList(List<Person> list){
        return list.stream()
                .filter(p->p.getAge()>18)
                .map(p->p.getFio())
                .sorted()
                .collect(Collectors.toList());

    }


}


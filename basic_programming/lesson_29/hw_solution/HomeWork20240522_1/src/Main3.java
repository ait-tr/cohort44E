import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Andrii", "Dolzhenko", 38));
        personList.add(new Person("Oleksandr", "Kravchenko", 29));
        personList.add(new Person("Dmytro", "Shevchenko", 45));
        personList.add(new Person("Ivan", "Kovalenko", 32));
        personList.add(new Person("Maksym", "Bondarenko", 27));
        personList.add(new Person("Oleh", "Tkachenko", 41));
        personList.add(new Person("Viktor", "Pavlenko", 39));
        personList.add(new Person("Yurii", "Rudenko", 26));
        personList.add(new Person("Serhii", "Lysenko", 34));

        System.out.println(join2(personList));
    }



    public static String join2(List<Person> list) {
        StringBuilder result = new StringBuilder();

        int counter = 1;
        for (Person str : list) {
            result.append(counter++ + ")  " + str.getName().charAt(0) + ". ").append(str.getLastName()).append("; ");
        }
        return result.toString();

    }
}

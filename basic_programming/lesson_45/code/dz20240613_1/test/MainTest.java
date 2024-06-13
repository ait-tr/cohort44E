import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getNamesList() {
        List<Person> people = List.of(
                new Person("Jack", "Jackson", 19),
                new Person("Ann", "Jackson", 17),
                new Person("Mike", "Tyson", 49),
                new Person("Nick", "Nicklson", 30),
                new Person("Donald", "Duck", 15),
                new Person("Lena", "Ivanova", 19),
                new Person("Karl", "Karlson", 49),
                new Person("Mark", "Knopler", 57)
        );

        List<String> expected = List.of(
                "J.Jackson",
                "K.Karlson",
                "L.Ivanova",
                "M.Knopler",
                "M.Tyson",
                "N.Nicklson"
        );

        Assertions.assertAll(
                    ()->Assertions.assertEquals(expected, Main.getNamesList(people)),
                    ()->Assertions.assertTrue(Main.getNamesList(new ArrayList<>()).isEmpty())
                );
    }
}
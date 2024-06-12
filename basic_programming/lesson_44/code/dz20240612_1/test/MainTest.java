import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private List<BankAccount> bankAccounts;

    @BeforeEach
    void setUp() {
        bankAccounts = List.of(
                new BankAccount(new Person("Jack", 18), "DE11111", 90),
                new BankAccount(new Person("Nick", 15), "DE11112", 1000),
                new BankAccount(new Person("Regina", 23), "DE11113", 8.23),
                new BankAccount(new Person("Ann", 17), "DE11114", 5700),
                new BankAccount(new Person("Charly", 32), "DE11115", 31000),
                new BankAccount(new Person("Duck", 41), "DE11116", 99),
                new BankAccount(new Person("Sam", 28), "DE11117", 10800),
                new BankAccount(new Person("John", 19), "DE11118", 77.67)
        );
    }


    @Test
    @DisplayName("get all clients")
    void listHandler1() {
        List<Person> expectedClients = new ArrayList<>();

        expectedClients.add(new Person("Jack", 18));
        expectedClients.add(new Person("Nick", 15));
        expectedClients.add(new Person("Regina", 23));
        expectedClients.add(new Person("Ann", 17));
        expectedClients.add(new Person("Charly", 32));
        expectedClients.add(new Person("Duck", 41));
        expectedClients.add(new Person("Sam", 28));
        expectedClients.add(new Person("John", 19));

        List<Person> actualClients = Main.listHandler(bankAccounts, ba -> true, ba -> ba.getPerson());
        Assertions.assertEquals(expectedClients,actualClients);

    }

    @Test
    @DisplayName("get all clients with balance<100")
    void listHandler2() {
        List<Person> expectedClients = new ArrayList<>();

        expectedClients.add(new Person("Jack", 18));
        expectedClients.add(new Person("Regina", 23));
        expectedClients.add(new Person("Duck", 41));
        expectedClients.add(new Person("John", 19));

        List<Person> actualClients = Main.listHandler(bankAccounts, ba -> ba.getBalance()<100 , ba -> ba.getPerson());
        Assertions.assertEquals(expectedClients,actualClients);

    }

    @Test
    @DisplayName("get all IBANs")
    void listHandler3() {
        List<String> expectedIban = new ArrayList<>();
        expectedIban.add("DE11111");
        expectedIban.add("DE11112");
        expectedIban.add("DE11113");
        expectedIban.add("DE11114");
        expectedIban.add("DE11115");
        expectedIban.add("DE11116");
        expectedIban.add("DE11117");
        expectedIban.add("DE11118");

        List<String> actualIbans = Main.listHandler(bankAccounts, ba -> true, ba -> ba.getIBAN());
        Assertions.assertEquals(expectedIban,actualIbans);

    }

    @Test
    @DisplayName("get all IBANs of owners age<16")
    void listHandler4() {
        List<String> expectedIban = new ArrayList<>();
        expectedIban.add("DE11112");


        List<String> actualIbans = Main.listHandler(bankAccounts, ba -> ba.getPerson().getAge()<16, ba -> ba.getIBAN());
        Assertions.assertEquals(expectedIban,actualIbans);

    }


    @Test
    @DisplayName("get Names to UpperCase")
    void listHandler5() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Jack", 18));
        persons.add(new Person("Nick", 15));
        persons.add(new Person("Regina", 23));
        persons.add(new Person("Ann", 17));
        persons.add(new Person("Charly", 32));
        persons.add(new Person("Duck", 41));
        persons.add(new Person("Sam", 28));
        persons.add(new Person("John", 19));


        List<String> expected = new ArrayList<>();
        expected.add("CHARLY");
        expected.add("DUCK");
        expected.add("SAM");



        List<String> actual = Main.listHandler(persons, p->p.getAge()>25, p->p.getName().toUpperCase());
        System.out.println(actual);
        Assertions.assertEquals(expected,actual);

    }

}
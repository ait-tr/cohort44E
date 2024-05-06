import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> listString = new ArrayList<>();
       listString.add("jack");
       listString.add("john");
       listString.add("ann");
       listString.add("ivan");
        System.out.println(listString);

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Jack",22));
        listPerson.add(new Person("Lena",19));
        listPerson.add(new Person("Poul",20));
        System.out.println(listPerson);

        //List<Transaction> transactions = new ArrayList<>();
        //List<Account> transactions = new ArrayList<>();

        for (int i = 0; i < listString.size() ; i++) {
            System.out.println(listString.get(i));
        }

        listString.remove(1);
        System.out.println(listString);

        //listString.clear();
        System.out.println(listString);

        listString.set(0, "qwertyu");
        System.out.println(listString);

        //listString.set(10, "12345");
        System.out.println(listString);

        System.out.println(listString.contains("ann"));

        System.out.println(listPerson);
        System.out.println( listPerson.contains(new Person("Ann",100)));
    }
}
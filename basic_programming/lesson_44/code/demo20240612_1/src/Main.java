import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("1", "twt", "rtyuiop", "ffsv", "hhhsjjajuwu");
        list.stream()
                .filter(s -> s.length() > 2)
                .map(s -> s.substring(0, 3))
                .forEach(s-> System.out.println(s));

        Random rnd = new Random();
        rnd.ints()
                .takeWhile(i->i>0)
                .forEach(i-> System.out.println(i));

        List<Person> people = List.of(
                new Person("Jack1", List.of("DE111", "DE112")),
                new Person("Jack2", List.of("DE113", "DE114", "DE115")),
                new Person("Jack3", List.of("DE116")),
                new Person("Jack4", List.of("DE117", "DE118"))
        );
        System.out.println("-----------------------------------------");
        people.stream()
                .map(p->p.getIbans())
                //.flatMap(p->p.getIbans().stream())
                .forEach(s-> System.out.println(s));


        people.stream().collect(Collectors.toList());
        people.stream().collect(Collectors.toSet());

        Person person = people.stream()
                .filter(p -> p.getName().startsWith("A"))
                .findAny()
                .orElseGet(() -> new Person("Artur", List.of("1234e")));

        people.stream()
                .filter(p->p.getIbans().size()>2)
                .toList();




    }





}
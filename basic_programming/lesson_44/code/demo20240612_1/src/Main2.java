import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<String> list = List.of("Jack", "John", "Mark", "Ann", "Lena");

        List<String> collect = list.stream().collect(Collectors.toList());
        Set<String> collect1 = list.stream().collect(Collectors.toSet());

        TreeSet<String> collect2 = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));

        //-------------------- MAP

        Map<String, Character> collect3 = list.stream().collect(Collectors.toMap(s -> s, s -> s.charAt(0)));
        System.out.println(collect3);

        Map<Character, String> collect4 = list.stream().collect(Collectors.toMap(s -> s.charAt(0), s -> s, (s1,s2)->s1    ));
        System.out.println(collect4);



    }
}

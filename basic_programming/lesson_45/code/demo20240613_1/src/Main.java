import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<Integer, List<String>> collect = Stream.of("qwe", "asd", "asdf","qwertyu", "ggggs","wer", "gggg", "asdf", "wer")
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(collect);


        Map<Integer, Set<String>> collect1 = Stream.of("qwe", "asd", "asdf", "qwertyu", "ggggs", "wer", "gggg", "asdf", "wer")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.toSet()));
        System.out.println(collect1);

        Map<Integer, Long> collect2 = Stream.of("qwe", "asd", "asdf", "qwertyu", "ggggs", "wer", "gggg", "asdf", "wer")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.counting()));
        System.out.println(collect2);

        Map<Integer, String> collect3 = Stream.of("qwe", "asd", "asdf", "qwertyu", "ggggs", "wer", "gggg", "asdf", "wer")
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.joining("|")));
        System.out.println(collect3);

        Integer collect4 = Stream.of("qwe", "asd", "asdf", "qwertyu", "ggggs", "wer", "gggg", "asdf", "wer")
                .collect(Collectors.collectingAndThen(Collectors.toList(), s -> s.size()));
        System.out.println(collect4);


        System.out.println(Stream.of(1, 3, 6, 2, 8, 2, 3, 65, 64, 34, 32, 56, 21, 97, 13, 87, 80)
                .collect(Collectors.groupingBy(i -> i % 8)));

        System.out.println(Stream.of("qwe", "asd", "asdf", "qwertyu", "ggggs", "wer", "gggg", "asdf", "wer")
                .collect(Collectors.partitioningBy(s -> s.length() > 4)));

    }
}
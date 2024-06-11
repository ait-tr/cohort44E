import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("jack", "John", "Lena", "kate");

        System.out.println(transformList1(list, s -> s.toUpperCase()  ));
        System.out.println(transformList2(list, s -> s.toUpperCase()  ));

        System.out.println(transformList2(List.of("qwe", "uuuuwyywu", "uuwhu"), s -> s.length()));


        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("John", 17),
                new Person("Ann", 20),
                new Person("Mike", 8),
                new Person("Oleg", 10)
        );


        List<String> list1 = transformList2(people, p -> p.getName());
        System.out.println(list1);

        System.out.println("---------------------------------------");
        people.forEach( (p)-> System.out.println(p) );


        System.out.println("---------------------------------");
        people.forEach(p-> p.agePlusYear());
        people.forEach(p-> System.out.println(p));



    }

/*
    public static List<String> transformList(List<String> list, Transformer transformer){

        List<String> resultList = new ArrayList<>();
        for (String str: list){
            resultList.add(transformer.apply(str));
        }

        return resultList;
    }
*/

    public static <E> List<E> transformList1(List<E> list, UnaryOperator<E> transformer){

        List<E> resultList = new ArrayList<>();
        for (E str: list){
            resultList.add(transformer.apply(str));
        }

        return resultList;
    }



    public static <E,R> List<R> transformList2(List<E> list, Function<E,R> transformer){

        List<R> resultList = new ArrayList<>();
        for (E str: list){
            resultList.add(transformer.apply(str));
        }

        return resultList;
    }



}




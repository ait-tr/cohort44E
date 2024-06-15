/*
Дан текст (в рамках данной задачи текст не содержит знаков препинания, слова разделены пробелом).
Ваша задача написать метод, который сформирует частотный словарь, т.е. получить map<String, Integer> где ключ - слово,
значение - сколько раз оно встречалось в тексте.
 */


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "anna jack lena anna john lena lena";
        Map<String, Integer> map = countingWords(str);
        System.out.println(map);

        List<Person> people = List.of(  new Person("Jack", 10),
                                        new Person("John", 20),
                                        new Person("Jack", 10),
                                        new Person("Jack", 10),
                                        new Person("Jack", 10),
                                        new Person("Lena", 20),
                                        new Person("Anna", 19)
        );
        Map<Person, Integer> map1 = countingWords(people);
        System.out.println(map1);

        Map<String, Integer> map2 = countingWords(people, p -> p.getName());
        System.out.println(map2);

        Map<Integer, Integer> map3 = countingWords(people, p -> p.getAge());
        System.out.println(map3);

    }
/*
    public static Map<String,Integer> countingWords(String str){
        return Arrays.asList(str.split(" ")).stream()
                .collect(Collectors.toMap( s->s, s->1, (i1,i2)-> ++i1         )  );
    }
*/

    public static Map<String,Integer> countingWords(String str){
        return countingWords(Arrays.asList(str.split(" ")));
    }



    public static<T> Map<T,Integer> countingWords(Collection<T> list){
        return countingWords(list, s->s);
        /*
        return list.stream()
                .collect(Collectors.toMap( s->s, s->1, (i1,i2)-> ++i1 )  );

         */
    }

    public static<T,R> Map<R,Integer> countingWords(Collection<T> list, Function<T,R> keyFunction){
        return list.stream()
                .collect(Collectors.toMap( keyFunction, s->1, (i1,i2)-> ++i1 )  );
    }


}
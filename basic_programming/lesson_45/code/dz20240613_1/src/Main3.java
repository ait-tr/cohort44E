import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Дан список Person (String firstName, String lastName, int age) используя Stream получить map<String, Integer>, где ключ ФИО в формате И.Иванов, значение возраст. В рамках данной задачи считаем, что у всех Person уникальная строка ФИО (повторов нет)

 */
public class Main3 {
    public static void main(String[] args) {

    }

    public static Map<String,Integer> listPersonToMap(List<Person> list){
        return list.stream()
                .collect(Collectors.toMap(p->p.getFio(), p-> p.getAge() ));
    }
}

import java.util.ArrayList;
import java.util.List;

public class PersonUtil {


    private PersonUtil(){};

    public static List<String> getNamesOfPersonOlderThan(List<Person> people, int ageLimit){
        List<String> names = new ArrayList<>();
        for (Person p: people){
            if(p.getAge()>ageLimit){
                names.add(p.getName());
            }
        }

        return names;
    }

    public static int count( Person person, List<Person> people ){
        int count = 0;
        for (Person p : people){
            if (p.equals(person)){
                count++;
            }
        }
        return count;
    }
}

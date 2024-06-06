import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("Jack","12-12-13");
        map.put("Oleg","12-12-15");
        map.put("Nick","12-12-18");
        map.put("Ann","12-12-13");
        System.out.println(map);

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1, "Jack");
        map2.put(10, "Tom");
        map2.put(14, "Kat");
        map2.put(18, "Jack");
        System.out.println(map2);


        Map<String,Person> map3 = new HashMap<>();
        map3.put("Jack", new Person("Jack",10));
        map3.put("Ann", new Person("Ann",8));
        map3.put("Ted", new Person("Ted",5));
        map3.put("Nick", new Person("Nick",19));
        map3.put("Mike", new Person("Mike",14));
        map3.put("Morpheus", new Person("Morpheus",12));

        System.out.println(map3);

        System.out.println(map3.get("Ted"));
        System.out.println(map3.keySet());
        Collection<Person> values = map3.values();
        System.out.println(values);

        map3.entrySet();


    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Box<String> strBox = new Box<>("qwertyui");
       Box<Integer> strBox2 = new Box<>(19);

        String value = strBox.getValue();
        Integer value1 = strBox2.getValue();


        Box2<String,Integer> box2= new Box2<>("qwe",10);
        System.out.println(box2);

        List<String> hello = createSingleElementList("hello");
        List<Integer> singleElementList = createSingleElementList(1);
        System.out.println(hello);
        System.out.println(singleElementList);
    }

    public static  <T> List<T> createSingleElementList(T arg){
        ArrayList<T> list = new ArrayList<>();
        list.add(arg);
        return list;
    }

}
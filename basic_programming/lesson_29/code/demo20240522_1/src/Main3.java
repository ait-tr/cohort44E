import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

     List<String> names = new ArrayList<>();
     names.add("Stan");
     names.add("Jack");
     names.add("Kate");
     names.add("Lena");
     names.add("Georg");

        System.out.println(join2(names));
    }
    public static String join(List<String> list) {

        String result = "";
        for (String str : list) {
            result += str;
        }
        return result;
    }

    public static String join2(List<String> list) {

        StringBuilder result = new StringBuilder();      // создаем StringBuilder
        //StringBuffer  result = new StringBuffer();
        for (String str : list) {                       // собираем "строку" используя StringBuilder
            result.append(str).append("|");
        }
        return result.toString();                      // StringBuilder -> String
    }

}

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hello", "Java", "Programming");
        List<String> list2 = Arrays.asList("Hello", "Java", "Programming", "Java");

        System.out.println("_________________________________");
        System.out.println("все строк в одну");
        System.out.println(ListTasks.concatenateStrings(list1));
        System.out.println("_________________________________");

        System.out.println("строк по убыванию их длины");
        System.out.println(ListTasks.concatenateStringsByLength(list1));
        System.out.println("_________________________________");

        System.out.println("замены повторяющихся слов");
        System.out.println(ListTasks.replaceDuplicates(list2, "Java"));
        System.out.println("----------------------------------");
    }
}
import java.util.Comparator;

public class ComparatorStringByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        /*
        if(o1.length()<o2.length()){
            return 100;
        } else if (o2.length()< o1.length()){
            return -100;
        } else {
            return 0;
        }
         */
        return o2.length()-o1.length();

    }
}

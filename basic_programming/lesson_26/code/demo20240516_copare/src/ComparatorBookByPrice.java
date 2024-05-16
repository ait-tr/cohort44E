import java.util.Comparator;

public class ComparatorBookByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPrice()>o2.getPrice()){
            return 1000;
        };
        if(o1.getPrice()<o2.getPrice()){
            return -1000;
        }
        return 0;
    }
}

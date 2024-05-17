import java.util.Comparator;

public class ComparatorBezeichnung implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getBezeichnung().compareTo(p2.getBezeichnung());
    }
}
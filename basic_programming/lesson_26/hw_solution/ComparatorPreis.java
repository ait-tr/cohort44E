import java.util.Comparator;

public class ComparatorPreis implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPreis(), p2.getPreis());
    }
}
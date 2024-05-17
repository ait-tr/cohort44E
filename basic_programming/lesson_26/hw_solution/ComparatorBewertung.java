import java.util.Comparator;

public class ComparatorBewertung implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getBewertung(), p2.getBewertung());
    }
}
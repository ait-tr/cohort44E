import java.util.ArrayList;
import java.util.List;

public class TransactionsList {
    private List<Transaction> list = new ArrayList<>();

    public void addTransaction(Transaction transaction){
        list.add(transaction);
    }

    public String toString() {
        String res="";
        for (int i = 0; i < list.size() ; i++) {
            res +=list.get(i)+"\n";
        }
        return res;

        //return list.toString();

    }

}

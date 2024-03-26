import java.util.Arrays;

public class Transactions {
    private Transaction[] array;
    private int size;

    public Transactions(int capacity){
        array = new Transaction[capacity];
        size=0;
    }

    public String toString(){
        System.out.println("-------- Transaction:");
        String res="";
        for (int i = 0; i < size; i++) {
            res=res+array[i]+"\n";
        }
        return res;
    }

    public String toStringFull(){
        System.out.println("-------- Transaction Full:");
        String res="";
        for (int i = 0; i < array.length; i++) {
            res=res+array[i]+"\n";
        }
        return res;
    }



    public void addTransaction(Transaction transaction){

        if (size>=array.length) {
            Transaction[] newArray = Arrays.copyOf(array, array.length * 2);
            array = newArray;
        }

        array[size] = transaction;
        size++;
    }







}

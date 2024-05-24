public interface AutoPrintable extends Printable{

    void print();

    default void print(String msg){
        print();
    }
}

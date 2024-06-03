public interface MyList<E> extends Iterable<E> {

    boolean add(E element);
    boolean add(int index, E element);
    E get(int index);
    int size();
    E remove(int index);
    E remove();
    E set(int index, E element);


}

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;



    @Override
    public boolean add(E element) {
        Node<E> node = new Node<>(tail,null,element);
        size++;
        if(tail!=null){
            tail.setNext(node);
        }
        if(head==null){
            head = node;
        }
        tail = node;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        return false;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return (node!=null)?node.getValue():null;
    }

    private Node<E> getNode(int index){
        if(index>=size || index<0 || head==null){
            return null;
        }
        int counter = 0;
        Node<E> aktiveNode=head;
        while (aktiveNode!=null && counter< index){
            aktiveNode=aktiveNode.getNext();
            counter++;
        }
        return aktiveNode;
    }

    @Override
    public int size() {
        return size;
    }

    private E remove(Node<E> node){
        if(node==null){
            return null;
        }
        Node<E> prev = node.getPrev();
        Node<E> next = node.getNext();

        if(prev!=null){
            prev.setNext(next);
        } else {
            head = next;
        }
        if(next!=null){
            next.setPrev(prev);
        } else {
            tail = prev;
        }
        size--;
        node.setPrev(null);
        node.setNext(null);
        E removedValue = node.getValue();
        node = null;
        return removedValue;
    }


    @Override
    public E remove(int index) {
        Node<E> node = getNode(index);
        return remove(node);
    }


    @Override
    public E remove() {
        return remove(tail);
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public String toString() {

        if(head==null){
            return "[]";
        };
        StringBuilder sb = new StringBuilder();
        Node<E> currentNode=head;
        while (currentNode!=null){
            sb.append(currentNode.getValue()).append(";");
            currentNode=currentNode.getNext();
        }
        sb.setLength(sb.length()-1);
        return "[" + sb.toString() + ']';
    }
}

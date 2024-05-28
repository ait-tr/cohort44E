public class MyLinkedList implements MyList {

    private Node head = null;
    private Node tail = null;
    private int size = 0;



    @Override
    public boolean add(String element) {
        Node node = new Node(tail,null,element);
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
    public String get(int index) {
        if(index>=size || head==null){
            return null;
        }
        int counter = 0;
        Node aktiveNode = head;
        while (aktiveNode.getNext()!=null && counter<index){
            aktiveNode = aktiveNode.getNext();
            counter++;
        }

        return (aktiveNode!=null)?aktiveNode.getValue():null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public String toString() {

        if(head==null){
            return "[]";
        };
        StringBuilder sb = new StringBuilder();
        Node currentNode=head;
        while (currentNode!=null){
            sb.append(currentNode.getValue()).append(";");
            currentNode=currentNode.getNext();
        }
        sb.setLength(sb.length()-1);
        return "[" + sb.toString() + ']';
    }
}

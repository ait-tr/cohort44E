public class Main {
    public static void main(String[] args) {


            MyList<String> list = new MyLinkedList();
        System.out.println(list);
            list.add("Jack");
            list.add("John");
            list.add("Nick");
            list.add("Nick1");

        System.out.println(list);

        MyLinkedList<Integer> ints = new MyLinkedList<>();
        ints.add(10);
        ints.add(20);
       // ints.add("20");





    }
}
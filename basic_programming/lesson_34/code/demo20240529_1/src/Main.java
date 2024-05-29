public class Main {
    public static void main(String[] args) {

       Box<String> strBox = new Box<>("qwertyui");
       Box<Integer> strBox2 = new Box<>(19);

        String value = strBox.getValue();
        Integer value1 = strBox2.getValue();


        Box2<String,Integer> box2= new Box2<>("qwe",10);
        System.out.println(box2);



    }
}
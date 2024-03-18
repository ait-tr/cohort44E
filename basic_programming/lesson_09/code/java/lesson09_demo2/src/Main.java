public class Main {
    public static void main(String[] args) {

        //Overloading
        //перегрузка методов

        System.out.println(add(10,20));
        System.out.println(add(10,20,90));
        System.out.println(add("hello"," Java"));
        System.out.println(add(new int[]{1,5,3}));

    }

    public static int add(int a, int b){
        System.out.println("1:");
        return a+b;
    }
    public  static  int add(int a, int b, int c){
        System.out.println("2:");
        return a+b+c;
    }
    public static int add(int[] array){
        System.out.println("4:");
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum= sum+array[i];
        }
        return sum;
    }

    public  static  String add(String a, String b){
        System.out.println("3:");
        return a+b;
    }
}
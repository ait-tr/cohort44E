public class Main {
    public static void main(String[] args) {
        int a = 77;
        test1(a);
        System.out.println(a);

        System.out.println("================================");
        int[] array = {1,1,1};
        test2(array);
        System.out.println("array[0]: "+array[0]);
    }

    public static int test1(int a){
        System.out.println("1. In method: " + a);
        a=20;
        System.out.println("2. In method: " + a);
        return 0;
    }

    public static int test2(int[] array){
        System.out.println("1. In method: " + array[0]);
        array[0]=20;
        System.out.println("2. In method: " + array[0]);
        return 0;
    }
}
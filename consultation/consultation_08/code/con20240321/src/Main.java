import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      method1("go");
      method1("done");


        System.out.println(  method2("9","gggg")    );
        //System.out.println(   "go done"   );
        System.out.println("-------------- ! -----------------");
        System.out.println(   method2(  method2("qwe","qwa"), method2("qwo", "qwu"))    );


      int f = method2("1234", "qwer").length();
      int a=10;

        System.out.println(    method3(5,3,6) + method3(9,10,1) - method3(a,7,5)     );

        System.out.println("-----------------------------------------------");
        int[] array= {8,8,3,9,2,4,-5,9,3};
        System.out.println(find(array,2));
        System.out.println();
    }

    public static void method1(String msg){
        System.out.println("Hello");
        System.out.println("I am void method");
        System.out.println(msg);
    }

    public static String method2(String msg1, String msg2){
        System.out.println(msg1+" " +msg2);
        return msg1+ " " + msg2;

    }

    public static int method3(int a, int b, int c){
        int res = Math.min ( Math.min(a,b), c);
        return res;
    }


    public static boolean find(int[] array, int num){
        int[] arr=Arrays.copyOf(array, array.length);
        Arrays.sort(arr);
        int index= Arrays.binarySearch(arr,num);
        return index>=0;
    }


}
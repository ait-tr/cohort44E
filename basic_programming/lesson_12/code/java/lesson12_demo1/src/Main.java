public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void print(int[] array){  //O(n)
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array[i] = array[1];
            System.out.println(array[i]);
        }
    }


    public static void print(int[] array, int index){  //O(1)
        System.out.println(array[index]);
        System.out.println(array[index]);
        System.out.println(array[index]);
        System.out.println(array[index]);
        System.out.println(array[index]);
    }

}




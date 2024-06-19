/*
Допустим, Ваш метод должен получить массив int размером 10x10 элементов.
Необходимо, что бы ваш метод бросал IllegalArgumentException если размер переданного
массива некорректен или вместо массива пришел null.
 */

public class Main {
    public static void main(String[] args) {
      int[][] arr={ {0,1,2,3,4,5,6}, {10,11,12,13,14}, {20,21,22}, {30,31,32,33} } ;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] array = new int[6][6];
        task(array,6,6);

    }
    public static void task(int[][] arr, int sizeA, int sizeB){
        if (arr==null){
            throw new IllegalArgumentException("the array is null");
        }
        if ( arr.length!=sizeA){
            throw new IllegalArgumentException("quantity of rows is not correct");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length!=sizeB){
                throw new IllegalArgumentException("quantity of columns is not correct");
            }
        }

        System.out.println("method temp is done!");

    }

}
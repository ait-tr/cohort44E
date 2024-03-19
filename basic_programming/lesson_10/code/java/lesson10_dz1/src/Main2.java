/*
Допустим дан массив чисел.

Написать метод, который в этом массиве меняет местами элемент с индексом index1 и элемент с индексом index2.
Написать метод, который возвращает индекс самого маленького числа в этом массиве.
Написать метод, который возвращает индекс самого маленького числа в этом массиве, но при этом поиск осуществляется только в части массива, заданной параметрами startIndex и endIndex.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] array = {6,4,9,-1,7,4};
        print(array);
        swap(array, 1,4);
        print(array);
        System.out.println(indexOfMin(array));
        int[] array1 = {6,4,-4,-1,7,-8};
        System.out.println(indexOfMin(array1,0,6));
        sort(array1);
        print(array1);


    }
    public static void  print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+i+"]:" + array[i] +"   ");
        }
        System.out.println();
    }

    public static  void  swap(int[] array, int index1, int index2){
       if (index1>=0 && index2>=0 && index1<array.length && index2<array.length) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
       }
    }

    public static  int  indexOfMin(int[] array){
        int indexMin = 0;
        for (int j=0;j<array.length;j++){
            if(array[j]<array[indexMin]){
                indexMin=j;
            }
        }
       return indexMin;

    }
    //  array[i] = 0
    // array[i+10-k] =1
    // array[876]=9;
    // array[i] = array[g]
    // array[i] = g
    // i = array[i]

    public static  int  indexOfMin(int[] array, int indexStart, int indexEnd){
        int indexMin = indexStart;
        for (int j=indexStart; j<array.length && j<indexEnd; j++){
            if(array[j] < array[indexMin]){
                indexMin=j;
            }
        }
        return indexMin;

    }

    public static void sort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int indexMin = indexOfMin(array,i,array.length);
            swap(array, i, indexMin);
        }

    }


}

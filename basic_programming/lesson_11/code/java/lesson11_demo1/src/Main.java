import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] array = {6,4,9,-1,7,4};
        //int[] array = createIntArray(20, -20,10);
        int[] array = inputArray();
        print(array);
        //sort(array);
        //bubbleSort(array);

        //Arrays.sort(array);
       // Arrays.binarySearch(array,26);

        print(array);
        System.out.println(binarySearch(array, 10));


        String[] strArray = {"Jack2", "Nick", "Poul","Jack1","Jbck",  "Lena"};
        print(strArray);
        sort(strArray);
        print(strArray);

    }

    public static  int[]  createIntArray(int size, int min, int max){
        Random random = new Random();
        int[] array= new int[size];
        //String[] str = new String[5];
        for (int i = 0; i < array.length; i++) {
            //array[i] = i;
            //array[i] = random.nextInt();
            array[i] = random.nextInt(max-min+1)+min;
        }
        return array;
    }

    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("  Введите ["+i+"] элемент: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("--------------------------");
        print(array);
        System.out.println("--------------------------");
        return array;
    }

    public static void  print(int[] array123){
        for (int i = 0; i < array123.length; i++) {
            System.out.print("["+i+"]:" + array123[i] +"   ");
        }
        System.out.println();
    }

    public static void  print(String[] array){
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

    public static  void  swap(String[] array, int index1, int index2){
        if (index1>=0 && index2>=0 && index1<array.length && index2<array.length) {
            String temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }


    public static  int  indexOfMin(int[] array, int indexStart, int indexEnd){
        int indexMin = indexStart;
        for (int j=indexStart; j<array.length && j<indexEnd; j++){
            if(array[j] < array[indexMin]){
                indexMin=j;
            }
        }
        return indexMin;

    }


    public static  int  indexOfMin(String[] array, int indexStart, int indexEnd){
        int indexMin = indexStart;
        for (int j=indexStart; j<array.length && j<indexEnd; j++){
            //if(array[j].charAt(0) < array[indexMin].charAt(0)){  // сравнение строк по первой букве
            if(array[j].compareTo(array[indexMin])<0){  // сравнение строк по алфавиту
                indexMin=j;
            }
        }
        return indexMin;

        // str1.compareTo(str2)

    }


    public static void sort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int indexMin = indexOfMin(array,i,array.length);
            swap(array, i, indexMin);
        }

    }


    public static void sort(String[] array){

        for (int i = 0; i < array.length; i++) {
            int indexMin = indexOfMin(array,i,array.length);
            swap(array, i, indexMin);
        }

    }

    public static void bubbleSort(int[] array){

        boolean isSwap = true;

        while (isSwap) {
            isSwap = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    isSwap = true;
                    swap(array, i, i - 1);
                }
            }
        }

    }

    public static int binarySearch(int[] array, int number){
        int left=0;
        int right = array.length-1;

        while (left <= right ){
            int mid = left + (right-left)/2;

            if (array[mid] == number){
               return mid;
            }
            if (array[mid]<number){
                left = mid +1;
            } else {
                right = mid -1;
            }

        }
        return -1;
    }








}

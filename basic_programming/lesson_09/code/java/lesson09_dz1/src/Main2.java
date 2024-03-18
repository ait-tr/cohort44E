/*
Допустим дан массив чисел.
- Написать метод, который возвращает самое маленькое число в этом массиве
- Написать метод, который возвращает индекс заданного числа в массиве. Если в массиве нет заданного числа, возвращаем -1,
если заданное число встречается несколько раз, возвращаем первый индекс, где встретилось данное число.

 */

public class Main2 {
    public static void main(String[] args) {

        int[] array = new int[]{6,7,-2,9,6,4};
        System.out.println(min(array));
        System.out.println(indexOf(array,9));
        System.out.println(indexOf(array,-9));


    }

    public  static int min(int[] arr){
        int min= arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int indexOf(int[] array, int number){
        for (int i= 0; i<array.length; i++){
            if(array[i] == number){
                return i;
            }
        }
        return -1;
    }

}

import java.util.Arrays;

public class IntArrayHandler {
    private int capacity = 3;
    private int size =0;
    private int[] array = new int[capacity];

    public void add(int element){
        if(size>=array.length){
            enlarge();
        }
        array[size++]=element;
    }

    private void enlarge() {
        /*
         1. создать новый массив
         2. скопировать все элементы из старого массива в новый
         3. новый массив присвоить полю класса
          */

        /*
        int[] temp = new int[array.length*2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
        */
        array = Arrays.copyOf(array, array.length*2);

        // есть еще вариант копирования массива
        // System.arraycopy(array,0, temp, 0, array.length);
    }

    public int get(int index){
        // нужно проверить значение 0<index<size  -> Exception
        return array[index];
    }

    public long sum(){
        long sum = 0;
        for (int i = 0; i < size ; i++) {
            sum+=array[i];  // sum = sum + array[i]
        }
        return sum;
    }

    public String toString(){
        /*
        String res="";
        for (int i = 0; i < size; i++) {
            res+="["+i+"]="+array[i]+"   ";
        }
        return res;

         */
        return Arrays.toString(Arrays.copyOf(array,size));
    }


}

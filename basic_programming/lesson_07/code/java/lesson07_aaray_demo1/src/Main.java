public class Main {
    public static void main(String[] args) {
       int a = 10;
       int[] array = {10,20,30,40,50,7,8,5,3,7};
/*
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        array[3] = 400;
        System.out.println(array[3]);
        array[2] = array[4];
        System.out.println(array[2]);
*/

        // перебрать и распечатать все элементы массива array
        for (int i=0; i<array.length; i++){
            System.out.print("["+i+"]="+array[i] + "      ");
        }
        System.out.println();

        System.out.println("-------------------------------");
        // добавим к каждому элементу массива 10
        for (int i=0; i<array.length; i++){
            array[i] = array[i]+10;
        }

        // перебрать и распечатать все элементы массива array
        for (int i=0; i<array.length; i++){
            System.out.print("["+i+"]="+array[i] + "      ");
        }
        System.out.println();

        // добавим к каждому элементу массива значение которого меньше ...,  10
        for (int i=0; i<array.length; i++){
            if (array[i]<20){
                array[i]=array[i]+10;
            }
        }

        // перебрать и распечатать все элементы массива array
        for (int i=0; i<array.length; i++){
            System.out.print("["+i+"]="+array[i] + "      ");
        }
        System.out.println();

        // перебрать и распечатать все элементы массива array с последнего до нулевого
        for (int i = array.length-1; i>=0; i--){
            System.out.print("["+i+"]="+array[i] + "      ");
        }
        System.out.println();

        // перебрать и распечатать все элементы массива array с i1 по i2
        int i1=5;
        int i2=100;
        for (int i=i1; i<=i2 && i<array.length; i++){
            System.out.print("["+i+"]="+array[i] + "      ");
        }
        System.out.println();

        // перебрать и распечатать все элементы массива array имеющие четные значения
        for (int i =0; i<array.length; i++){
            if (array[i]%2==0){
                System.out.print("["+i+"]="+array[i] + "      ");
            }
        }
        System.out.println();

        // перебрать и распечатать все элементы массива array
        int counter=0;
        for (int i=0; i<array.length;i++){
            if(array[i]%2!=0){
                counter++;
            }
        }
        System.out.println(counter);

        // ------------------------------------------

        // создали новый "пустой" массив array1 такой же длинны, как и массив array
        int[] array1 = new int[array.length];

        // перебрать и распечатать все элементы массива array1
        for (int i=0; i<array1.length; i++){
            System.out.print("["+i+"]="+array1[i] + "      ");
        }
        System.out.println();

        // перебрать и скопировать все элементы массива array в массив array1
        for (int i = 0; i<array.length; i++){
            array1[i]=array[i];
        }
        // перебрать и распечатать все элементы массива array1
        for (int i=0; i<array1.length; i++){
            System.out.print("["+i+"]="+array1[i] + "      ");
        }
        System.out.println();



    }
}
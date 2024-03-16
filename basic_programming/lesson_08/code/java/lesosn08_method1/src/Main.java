public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,6,9,3,5,9};
        int[] array2 = {1,0,-77,0,55,32};
        int[] array3 = {1,1,1,-2,-2,7,9,4,3,6,7,-1,-1,6};
        int[] array4 = {1,5,9};



        printArray(array1);
        int s1 = calcSum(array1);
        System.out.println(s1);

        printArray(array2);
        System.out.println( calcSum(array2)  );

        printArray(array3);
        printArray(array4);
    }

    public static void printArray(int[] array){

        for (int i=0; i<array.length; i++){
            System.out.print("["+i+"]:"+array[i] + "  ");
        }
        System.out.println( "  Сумма: " + calcSum( array));
        System.out.println();


    }

    public static int calcSum(int[] array){

        int sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        return sum;
    }




}


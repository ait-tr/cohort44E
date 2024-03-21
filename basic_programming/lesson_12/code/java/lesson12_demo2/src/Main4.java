public class Main4 {
    public static void main(String[] args) {

        int[] array = {-1,-6,+4,-9};

        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){
                flag=true;
            }
        }
        System.out.println(flag?"больше":"меньше");


    }
}

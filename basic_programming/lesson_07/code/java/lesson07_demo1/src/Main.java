public class Main {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for (i=0  ; i<1000; i++){
            sum = sum+i;
            if (sum>=1000) {
                break;   // прерывает выполнение цикла
            }
        };
        System.out.println("i= " + i);
        System.out.println("sum=  " + sum);

        ////
        System.out.println("-------------------------------------------");
        for (i= 0; i<20; i++ ){
            if (i%2==0){
                System.out.println("четное число");
                continue;  // прерывает текущую итерацию и начинает новую
            }
            System.out.println(i);

        }


    }



}
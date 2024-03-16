public class Main3 {
    public static void main(String[] args) {

        //double[] array = {1.5, 7.2, 4.4, 8.5, 9.0, 1.0, 16.2};
        double[] array = {2.0, 2.0, 2.0, 2.0};

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        System.out.println("Среднее значение: " + avg);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntArrayHandler intArray = getIntArray();
        System.out.println(intArray);
        System.out.println(intArray.sum());



    }

    public static IntArrayHandler getIntArray(){
        IntArrayHandler arrayHandler = new IntArrayHandler();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("input next int or '0' for exit");
            int inputtedInt = scanner.nextInt();
            if (inputtedInt!=0){
                arrayHandler.add(inputtedInt);
            } else {
                break;    // выход из цикла
            }
        }
        return arrayHandler;
    }

}
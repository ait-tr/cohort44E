import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=100;
        String str = "100";
        double num2=100;
        //int num3= 100.0; // error!!!!
        boolean bool1= true;
        boolean bool2= false;


      Scanner scanner = new Scanner(System.in);
      System.out.println("Input age:");
      int age = scanner.nextInt();
      boolean isAdult = age>18;
      //System.out.println(isAdult);

      /*
      >
      <
      >=
      <=
      ==
      !=
       */

      //  &&    -   И

      if (10 > age ||  age > 80){
          System.out.println("OK");
      } else {
          System.out.println("not OK");
      }

      int month=6;

      boolean isSummer = month==6 || month==7 || month==8;
      boolean isSummer2 = month>=6 && month<=8;

    }
}
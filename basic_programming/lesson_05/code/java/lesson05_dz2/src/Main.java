/*
Есть прибор у которого есть 2 колбы. В программе дано две переменных,
которые содержат температуру каждой колбы (значение для этих переменных можно задать со Scanner, можно просто присвоить значение в программе).
Считается, что прибор работает корректно, если разница температуры между кобами не более 10 градусов и ни в одной из колб температура не превышает 70 градусов.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value 1:");
        int t1 = scanner.nextInt();
        System.out.println("Input value 2:");
        int t2 = scanner.nextInt();

//---------------------------------------------------------------------------------

        int diff = Math.abs(t1-t2);
        boolean result = (t1<=70 && t2<=70)  &&  (diff>=0 && diff<=10);



        if (result){
            System.out.println("ok");
        } else {
            System.out.println("error");
        }

        // ------------------------------------
        //   0<(t1-t2)<10

        /*  Модуль
            |-5| = 5      Math.abs()
            |5| = 5
         */





    }
}
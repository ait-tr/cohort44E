/*
 Представьте, Вы пишите программу  для расчета штрафов за превышение скорости.
 Пользователь вводит: 1) ограничение скорости на данном участке дороги  2) скорость, с которой двигался автомобиль
 Если введено скоростное ограничение 0, тогда на участке скорость не ограничена.

Таблица штрафов такая:
1) если разрешенная скорость на участке 50 км в час и менее, то:
  -  превышение менее чем на 10 км не штрафуется
  - от 10 км до 20 км от скоростного ограничения – 50 евро
  - от 20 км до 40 км от скоростного ограничения – 150 евро
  - свыше 40 км от скоростного ограничения – 350 евро и лишение прав

2) если разрешенная скорость на участке более 50 км то:
  -  превышение менее чем на 20 км не штрафуется
  - от 20 км до 40 км от скоростного ограничения – 50 евро
  - от 40 км до 70 км от скоростного ограничения – 250 евро
  - свыше 70 км от скоростного ограничения – 450 евро и лишение прав

Реализуйте программу, которая рассчитывает штраф и выводит соответствующее сообщение на экран.


 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ctrl+D
        Scanner scanner = new Scanner(System.in);

        System.out.println("Real speed of car: ");
        int speed = scanner.nextInt();

        System.out.println("Speed limit: ");
        int speedLimit = scanner.nextInt();

        System.out.println("--------------------------------------------");
        System.out.println("Real speed: "+ speed + " Speed limit:" + speedLimit);


        // ------------------------------------------------------------------
        int overSpeed = speed - speedLimit;
        if ( overSpeed > 0 && speedLimit!=0) {  // есть превышение

            int penalty=0;
            boolean isDriveLicenseValid = true;


            /*
            if (speedLimit<50){
                if ..
            } else {
                if ....
            }

             */

            if (speedLimit<50){
                if (overSpeed<10){
                    penalty =0;
                } else if (overSpeed<20){
                    penalty =50;
                } else if (overSpeed<40) {
                    penalty=150;
                } else {
                    penalty=350;
                    isDriveLicenseValid = false;
                }
            } else {
                if (overSpeed<20){
                    penalty =0;
                } else if (overSpeed<40){
                    penalty =50;
                } else if (overSpeed<70) {
                    penalty=250;
                } else {
                    penalty=450;
                    isDriveLicenseValid = false;
                }
            }

            System.out.println("Penalty is: " + penalty);
            /*
            if (!isDriveLicenseValid){
                System.out.println("Drive License is not valid ");
            }
             */
            System.out.println( isDriveLicenseValid ? "" : "Drive License is not valid ");
        }  else {
            System.out.println("no penalty");
        }

    }
}
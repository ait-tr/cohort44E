package lesson3;

public class SumOfDigits {
    static int number = 123;

    public static void main(String[] args) {
        int i = 123;
        sumDigits1(i);// 1метод
        sumDigits2(i);// 2метод
        int sum = sumOfDigits(i);// 3метод
        System.out.println(sum);
    }

    //    метод, ничего не возвращает. Печатает сумму трех цифр. Простой подсчет математикой
    static void sumDigits1(int i) {
        int sum = i % 10 + (i / 10) % 10 + (i / 100) % 10;
        System.out.println(sum);
    }

    //    метод, ничего не возвращает. Печатает сумму трех цифр. Работает через цикл.
    static void sumDigits2(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

    //    метод, возвращает нам значение типа int. Работает через рекурсию.
    static int sumOfDigits(int i) {
        if (i == 0) {
            return 0;
        }
        return i % 10 + sumOfDigits(i / 10);// 3 осталась и вызываем снова этот метод но у 12
    }
}

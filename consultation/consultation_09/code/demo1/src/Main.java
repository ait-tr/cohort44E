import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"Jack", "John", "Nickolaus", "Leo"};
        //String[] names = {"Jack","John","Nickolaus","Leo"};

        printArray(names);

        String findName = readNameFromScanner(); //"Lena";
        System.out.println("Имя " + findName + (isNamePresent(names, findName) ? " присутствует" : " отсутствует"));

        int index = findIndexOfName(names, findName);
        System.out.println(index >= 0 ? "Номер в массиве - " + index : "");
    }

    public static String readNameFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        return name;
    }


    /* Печать
    1) сделать метод в который передать массив
    2) цикл, который "перебирает" каждый элемент массива
    3) в теле цикла печатать каждый элемент
    */
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*
    1) сделать метод в который передать массив и имя для поиска
    2) цикл, который "перебирает" каждый элемент массива
    3) в теле цикла каждый элемент проверить совпадает ли он с искомым именем
    4) если пробежали весь массив и не нашли совпадений - возвращаем false
     */

    public static boolean isNamePresent(String[] array, String findName) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(findName)) {
                return true;
            }
        }
        return false;
    }

    public static int findIndexOfName(String[] array, String findName) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(findName)) {
                return i;
            }
        }
        return -1;
    }


}
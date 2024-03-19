/*
Допустим дан массив имен, например, заданный так:

String[] names = {"Jack", "John", "Vlad", "Alex"};
Написать метод int indexOf(String[] array, String str), который возвращает индекс имени заданного в параметре str. Если такого имени нет, возвращаем -1
Написать метод int indexOf(String[] array, String str, int startIndex), который возвращает индекс имени заданного в параметре str. Если такого имени нет, возвращаем -1. При этом, поиск осуществляется начиная с индекса startIndex

 */

public class Main {
    public static void main(String[] args) {
        String[] names = {"Jack", "John", "Vlad", "Alex", "Jack"};
        System.out.println(indexOf(names,"Jack",1));

    }

    public static int indexOf(String[] array, String str){
        int index = -1;
        for (int i = 0; i< array.length; i++){
           if(array[i].equals(str)){
               return i;
           }
        }

        return index;
    }

    public  static int indexOf(String[] array, String str, int startIndex){
/*
        if (startIndex<=0){
            return indexOf(array,str);
        }
*/
        int index = -1;
        startIndex = startIndex>=0 ? startIndex : 0;
        for (int i= startIndex; i<array.length; i++ ){
            if(array[i].equals(str)){
                return i;
            }
        }
        return index;
    }

}
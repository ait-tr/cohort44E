/*
Дана строка следующего вида:
Ivan Ivanov;Oleg Petrov;Anna Kovaleva
т.е. строка представляет список имен и фамилий разделенный точкой с запятой.
Ваша задача написать метод который формирует строку вида:
I.Ivanov;O.Petrov;A.Kovaleva

 */


public class Main {
    public static void main(String[] args) {

    }

    public static String stringHandler (String str){
        String[] namesArray = str.split(";");
        for (int i = 0; i < namesArray.length; i++) {
            namesArray[i] = toShortFio(namesArray[i]);
        }
        return join(namesArray);

    }

    public static String toShortFio(String str){
        String[] namesArray = str.split(" ");
        return "" + namesArray[0].charAt(0)+'.' + namesArray[1];
    }

    public static String join(String[] array){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]).append(";");
        }
        result.setLength(result.length()-1);
        return result.toString();
    }


  //  "Ivan Ivanov" - > "I.Ivanov"
}
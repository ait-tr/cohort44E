import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ListTasks {

    // Метод для объединения всех строк в одну

    public static String concatenateStrings(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString();
    }

    // Метод для объединения строк по убыванию их длины

    public static String concatenateStringsByLength(List<String> strings) {
        strings.sort(Comparator.comparingInt(String::length).reversed());
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString();
    }

    // Метод для замены повторяющихся слов
    public static List<String> replaceDuplicates(List<String> strings, String word) {
        boolean firstOccurrence = true; // Флаг для отслеживания первого вхождения слова
        for (int i = 0; i < strings.size(); i++) { // Цикл для перебора всех элементов списка
            if (strings.get(i).equalsIgnoreCase(word)) { // Проверка, равно ли текущее слово заданному слову (без учета регистра)
                if (firstOccurrence) { // Если это первое вхождение
                    firstOccurrence = false; // Устанавливаем флаг в false, чтобы отметить, что первое вхождение найдено
                } else { // Если это не первое вхождение
                    strings.set(i, "[Повтор] " + word); // Заменяем текущее слово на "[Повтор] " + слово
                }
            }
        }
        return strings; // Возвращаем измененный список
    }
}
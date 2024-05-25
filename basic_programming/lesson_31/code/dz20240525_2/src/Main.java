import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Дан List<Employee>.
У каждого Employee задано имя и год, с которого сотрудник работает в фирме.
Руководство решило премировать N сотрудников, которые работают дольше всех.
Напишите метод, который вернет новый List<Employee> премируемых сотрудников.
Реализовать тесты.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static List<Employee> selectEmployeeForBonus(List<Employee> list, int N){
        List<Employee> result = new ArrayList<>();
        List<Employee> sortedList = createSortedCopy(list,new ComparatorEmployeeByYear());
        for (int i = 0; i < Math.min(N,sortedList.size()); i++) {
            result.add(sortedList.get(i));
        }
        return result;
    }
    public static List<Employee> createSortedCopy(List<Employee> list, Comparator<Employee> comparator){
        ArrayList<Employee> result = new ArrayList<>(list);  // result - копия листа list
        Collections.sort(result,comparator);                 // сортируем result
        return result;
    }

}


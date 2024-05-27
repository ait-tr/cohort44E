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

[можно еще чуть сложнее]
В предыдущей задачи учтите,
что если например, нужно премировать 3 сотрудника, но при этом в компании 5 старейших сотрудников
с одинаковым стажем, необходимо премировать всех пятерых.
Или например, есть 2 старейших сотрудника со стажем 10 лет, и еще 5 со стажем 9 лет - премируем всех семерых.
Реализовать тесты.





 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static List<Employee> selectEmployeeForBonus(List<Employee> list, int N){
        List<Employee> result = new ArrayList<>();
        List<Employee> sortedList = createSortedCopy(list,new ComparatorEmployeeByYear());
        int i=0;
        int year=0;
        for (i = 0; i < Math.min(N,sortedList.size()); i++) {
            Employee emp = sortedList.get(i);
            result.add(emp);
            year=emp.getYear();
        }
        for ( ; i<sortedList.size(); i++){
            Employee employee = sortedList.get(i);
            if (employee.getYear() == year){
                result.add(employee);
            } else {
                break;
            }
        }
        return result;
    }
    public static List<Employee> createSortedCopy(List<Employee> list, Comparator<Employee> comparator){
        ArrayList<Employee> result = new ArrayList<>(list);  // result - копия листа list
        Collections.sort(result,comparator);                 // сортируем result
        return result;
    }

}


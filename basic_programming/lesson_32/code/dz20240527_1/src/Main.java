/*
4.  Дан список Student. Для каждого спортсмена задано имя и список оценок.
    Список оценок это List<Integer>. Причем каждая оценка это число от 1 до 10,
    у каждого студента не более 10 оценок. Т.е. максимальный балл,
    который может набрать студент 100.
    Напишите программу которая формирует строку вида: Jack - 19;John -23;Kate-31 где число означает,
    сколько студент не добрал до максимального балла.
    Причем, студенты должны идти в порядке возрастания “недобора”.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Jack", 6, 9, 10, 2, 4, 8, 7));
        studentList.add(new Student("John", 7, 9, 5, 2, 8, 10, 7, 3));
        studentList.add(new Student("Kate", 2, 9, 10, 7, 4, 9, 7));
        studentList.add(new Student("Ivan", 6, 9, 10, 2, 8, 7));
        studentList.add(new Student("Olga", 6, 9, 8, 2, 4, 3, 7, 10, 10));

        Collections.sort(studentList, new ComparatorStudentByShortfall());
        System.out.println(studentList);
        System.out.println("-----------------");
        System.out.println(studentToString(studentList));


    }

    public static String studentToString(List<Student> studentList){
        StringBuilder sb = new StringBuilder();
        for (Student s: studentList){
            sb.append(s.getName()).append("-").append(s.getShortfall()).append(";");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}

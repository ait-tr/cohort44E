/*
Допустим, у вас в программе есть класс Programmer. Кроме имени у него есть поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».  Вам необходимо реализовать метод String doWork(String taskMsg) который в качестве результата, либо возвращает строку stringMsg большими буквами, либо кидает exceptions.ProgrammerBusyException (статус “занят”), либо exceptions.ProgrammerUnavailableNowException (статус “недоступен”) в зависимости от текущего состояния программера.
В Main необходимо либо, выводить результат работы либо обработать Exception и вывести сообщение «Программист занят другой задачей» или «Программист не доступен».


Давайте дополним задачу 2. Допустим, у вас в программе есть TeamLead, который  тоже может быть «доступен» и «не доступен», что определяется текущим значением поля status. Еще у него есть поле List<Programmer> team, которое содержит список программистов. Реализовать метод String doTask(String taskMsg), который пытается «поручить» задачу первому доступному программисту ( вызвав у него doWork(String taskMsg) и вернут результат, либо кидает TeamLeadUnavailableNowException (TeamLead не доступен) либо AllProgrammersAreBusyNowException (не нашлось доступных пронраммистов). В зависимости от результата, вызывающий main выводить результат работы или сообщение «Нам не хватает программистов!» или «Почему TeamLead не на месте».


 */


import exceptions.MyGeneralException;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Programmer p1 = new Programmer("p1");
        Programmer p2 = new Programmer("p2");
        Programmer p3 = new Programmer("p3");
        Programmer p4 = new Programmer("p4");
        Programmer p5 = new Programmer("p5");
        p1.setStatus("не доступен");
        p2.setStatus("занят");
        p3.setStatus("не доступен");
        p4.setStatus("занят");
        p5.setStatus("занят");

        TeamLead teamLead = new TeamLead("TL", List.of(p1,p2,p3,p4,p5));
        teamLead.setStatus("доступен");

        try {
            String result = teamLead.doTask("hello java");
            System.out.println(result);
        } catch (AllProgrammersAreBusyNowException e){
            System.out.println(e.getMessage());
            System.out.println(e.getInfo());
        }
        catch (MyGeneralException e){
            System.out.println(e.getMessage());
        }
    }
}
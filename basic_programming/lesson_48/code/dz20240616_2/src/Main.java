/*
Допустим, у вас в программе есть класс Programmer. Кроме имени у него есть поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».  Вам необходимо реализовать метод String doWork(String taskMsg) который в качестве результата, либо возвращает строку stringMsg большими буквами, либо кидает exceptions.ProgrammerBusyException (статус “занят”), либо exceptions.ProgrammerUnavailableNowException (статус “недоступен”) в зависимости от текущего состояния программера.
В Main необходимо либо, выводить результат работы либо обработать Exception и вывести сообщение «Программист занят другой задачей» или «Программист не доступен».

 */


import exceptions.MyGeneralException;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Sergey");
        programmer.setStatus("занят");
        try {
            String result = programmer.doWork("hello java");
            System.out.println(result);
        } catch (MyGeneralException e){
            System.out.println(e.getMessage());
        }
    }
}
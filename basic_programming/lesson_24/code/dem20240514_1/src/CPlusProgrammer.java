public class CPlusProgrammer extends Employee implements Programmer{


    public CPlusProgrammer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("C++ Программист");
    }

    public void writeCode(){
        System.out.println("пишу код на с++");
    }
}

public class Manager extends Employee{
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("manager");
    }
}

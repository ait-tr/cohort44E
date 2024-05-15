public  abstract class Employee {
    private String name;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
    public void  salary(){
        System.out.println(name +  ": Pay salary " + salary);
    }

}

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name,salary);
        this.bonus = bonus;
    }



    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                ", bonus=" + bonus +
                '}';
    }
    @Override
    public void salary(){
        System.out.println(getName() + " get the salary " + getSalary() + " bonus " + bonus);
    }

    public void work(){
        System.out.println("I'm manage " + getName() + " I kicks all employees ");
    }

    public void temp(){
        super.temp();
        System.out.println("Manager temp");
    }


}

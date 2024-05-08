public class QAEngineer extends Employee {


    public QAEngineer(String name, double salary) {
        super(name,salary);
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    public void work(){
        System.out.println("I'm QA engineer " + getName() + " I check code ");
    }

}

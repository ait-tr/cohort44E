public class Programmer extends Employee {

    public Programmer(String name, double salary) {
        super(name,salary);
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString()+  "}";
    }

    @Override
    public void work(){
        System.out.println("I'm programmer " + getName() + " I write code ");
    }



    }

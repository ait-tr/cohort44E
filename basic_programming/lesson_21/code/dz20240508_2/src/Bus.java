public class Bus extends Vehicle {
    private int capacity;

    public Bus(String number, String brand, int year, int capacity) {
        super(number, brand, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                " capacity=" + capacity +
                " people}";
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void drive() {
        System.out.println(getNumber() + " drive .......   with " + getCapacity() + " passengers") ;
    }
}

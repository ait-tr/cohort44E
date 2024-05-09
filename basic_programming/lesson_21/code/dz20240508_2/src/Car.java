public final class Car extends Vehicle{
    public Car(String number, String brand, int year) {
        super(number, brand, year);
    }

    @Override
    public String toString() {
        return "Car{"+ super.toString()+ "}";
    }
}

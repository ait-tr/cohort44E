public abstract class Vehicle {

    private String number;
    private String brand;
    private int year;

    public Vehicle(String number, String brand, int year) {
        this.number = number;
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "number='" + number + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year;
    }

    public String getNumber() {
        return number;
    }

    public void drive(){
        System.out.println(getNumber() + " drive ...... ");
    }
}

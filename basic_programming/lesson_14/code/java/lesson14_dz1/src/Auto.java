public class Auto {
    String brand;
    String model;
    String color;
    double price;
    String numberPlate;
    MyDate registrationDate;

    public Auto(String brand, String model, String color, double price, String numberPlate, MyDate registrationDate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.numberPlate = numberPlate;
        this.registrationDate = registrationDate;
    }

    public  String toString(){
        return numberPlate + " "
                + brand
                + "("+model+") "
                + color + " "
                + price + " "
                + registrationDate;
    }

    public void start(){
        System.out.println(numberPlate + " - включил двигатель");
    }
    public void stop(){
        System.out.println(numberPlate + " - выключил двигатель");
    }

}

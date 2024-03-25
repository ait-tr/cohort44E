public class Main2 {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(20,2,2021);
        System.out.println(date1);
        System.out.println(date1.getMonthTitle());

        System.out.println("------------------------------------------------");


        Auto auto1 = new Auto("BMW", "X5","black",10000, "BBB8898", new MyDate(13,7,2010));
        Auto auto2 = new Auto("Audi", "A5","black",15000, "BRT787", new MyDate(14,8,2018));
        Auto auto3 = new Auto("Opel", "Corsa","red",8000, "BHJ6543", new MyDate(21,9,2013));
        Auto auto4 = new Auto("Lada", "Kalina","Green", 4000, "JDS3245", new MyDate(4,9,2020));


        Auto[] autos = new Auto[]{auto1
                ,auto2
                ,auto3
                ,new Auto("Mercedes", "C250","gray",28000, "HYI7887", new MyDate(21,9,2013))

        };

        AutoPark autoPark = new AutoPark(autos);
        System.out.println(autoPark);

        System.out.println(autoPark.getMaxPriceAuto() );
        System.out.println("В автопарке " + autoPark.getSize() + " авто");
        auto1.start();



    }
}

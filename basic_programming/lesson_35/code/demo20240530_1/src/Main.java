public class Main {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass(10);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(20);

        System.out.println(innerClass);


        Demo demo = new Demo();

        OuterClass2.StaticInnerClass staticInnerClass = new OuterClass2.StaticInnerClass();
    }
    public static void method(){
        class MyDate{
            private int day;
            private int month;
            private int year;

            public MyDate(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }
        }

        MyDate myDate = new MyDate(10, 10, 2004);
        MyDate myDate1 = new MyDate(10, 10, 2004);


    }

}
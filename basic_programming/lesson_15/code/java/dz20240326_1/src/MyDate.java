public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(int day, int month){
        this(day,month, 2024);

        /*
        this.day = day;
        this.month = month;
        this.year = 2024;

         */
    }

    @Override
    public String toString() {
        return day +
                "/" + month +
                "/" + year;
    }

    public String toUsaDateFormatString(){
        return year+ "/"+ month+ "/" + day;
    }

}

public class MyDate {
    int day;
    int month;
    int year;

    // конструктор
    // название == названию класса
    // нет типа результата


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public  String toString(){
        return day +" " + getMonthTitle() + " " + year;
    }


    public String getMonthTitle() {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10:return "October";
            case 11:return "November";
            case 12:return "December";
            default:
                return "Invalid choice";
        }
    }


}

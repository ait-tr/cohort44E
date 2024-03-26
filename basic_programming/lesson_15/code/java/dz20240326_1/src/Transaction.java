public class Transaction {
    Account from;
    Account to;
    double amount;
    MyDate date;

    public Transaction(Account from, Account to, double amount, MyDate date) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return date + " " + from + " " + to + " " + amount;
    }

    // 2024/1/23 DE1234567 DE1234567 200
    public String toAccountString(){
        return  date.toUsaDateFormatString() + " " + from.getIban() + " " + to.getIban() + " "+ amount;
    }

    // 2024/1/23 From: Иванов И. (DE1234567) To: Петров А. (DE1234567) 200
    public  String toNameAccountString(){
        return  date.toUsaDateFormatString() + " From:" + from.toNameIbanString() + " To:" + to.toNameIbanString() + " "+ amount;
    }

}

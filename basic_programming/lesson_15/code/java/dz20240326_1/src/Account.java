public class Account {
    private String iban;
    private double balance;
    private Person owner;
    private MyDate openDate;

    public Account(String iban, double balance, Person owner, MyDate openDate) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
        this.openDate = openDate;
    }

    @Override
    public String toString() {
        return iban + " [" + balance +"]" +
                ", owner=" + owner +
                ", openDate=" + openDate;
    }

    public String toNameIbanString(){
        return  owner.toSmallString() + "(" + getIban() +")";
    }
    public String getIban(){
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

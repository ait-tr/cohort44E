public class Bank {

    private String title;
    private Account[] accounts;

    public Bank(String title, Account[] accounts) {
        this.title = title;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank: " +  title +"\nСчета:\n"
                + accuntsToString();
    }

    private String accuntsToString() {
        String res="";
        for (int i = 0; i < accounts.length ; i++) {
            res +=accounts[i]+"\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public Account getAccountByOwnerLastName (String lastName){
        for (int i = 0; i < accounts.length ; i++) {
            if(accounts[i].getOwner().getLastName().equals(lastName)){
                return accounts[i];
            }
        }
        return null;
    }

    public void depositAccountByOwnerLastName(String lastName, double amount){
        Account account = getAccountByOwnerLastName(lastName);
        if (account!=null){
            account.deposit(amount);
        }
    }

    public void withdrawAccountByOwnerLastName(String lastName, double amount){
        Account account = getAccountByOwnerLastName(lastName);
        if (account!=null){
            account.withdraw(amount);
        }
    }


}

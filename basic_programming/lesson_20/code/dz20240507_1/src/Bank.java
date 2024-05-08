import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String title;
    private List<Account> accountList = new ArrayList<>();
    TransactionsList transactionsList = new TransactionsList();

    public Bank(String title, Account[] arr) {
        this.title = title;
        addNewAccount(arr);
    }

    public Bank(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Bank: " +  title
                + "\nВсего счетов: " + accountList.size()
                + "\nСчета:\n"
                + accuntsToString();
    }

    private String accuntsToString() {
        String res="";
        for (int i = 0; i < accountList.size() ; i++) {
            res +=accountList.get(i)+"\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    // accounts[i] <=> accountList.get(i)
    public Account getAccountByOwnerLastName (String lastName){
        for (int i = 0; i < accountList.size() ; i++) {
            Account account = accountList.get(i);
            if(account.getOwner().getLastName().equals(lastName)){
                return account;
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

    public boolean transfer(String lastNameFrom, String lastNameTo, double amount){
        Account accountFrom = getAccountByOwnerLastName(lastNameFrom);
        Account accountTo = getAccountByOwnerLastName(lastNameTo);

        if (accountFrom==null || accountTo==null){
            return false;
        }
        if (accountFrom.withdraw(amount)){
            accountTo.deposit(amount);
            transactionsList.addTransaction(new Transaction(accountFrom,accountTo,amount));
            return true;
        }
        return false;
    }

    public TransactionsList getTransactionsArray() {
        return transactionsList;
    }

    // addNewAccount - перегруженный метод (overloading)
    public void addNewAccount(Account[] arr) {
        for (int i = 0; i< arr.length; i++){
            addNewAccount(arr[i]);
        }
    }

    public void addNewAccount(Account account){
        accountList.add(account);
    }

}

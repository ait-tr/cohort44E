public class Bank {
    private int capacity = 6;
    private String title;
    private Account[] accounts = new Account[capacity];
    private int size;
    private TransactionsArray transactionsArray=new TransactionsArray();


    public Bank(String title, Account[] arr) {
        this.title = title;
        size = 0;
        addNewAccount(arr);
    }

    public Bank(String title) {
        this.title = title;
        size = 0;
    }



    @Override
    public String toString() {
        return "Bank: " +  title
                + "\nВсего счетов: " + size
                + "\nСчета:\n"
                + accuntsToString();
    }

    private String accuntsToString() {
        String res="";
        for (int i = 0; i < size ; i++) {
            res +=accounts[i]+"\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public Account getAccountByOwnerLastName (String lastName){
        for (int i = 0; i < size ; i++) {
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

    public boolean transfer(String lastNameFrom, String lastNameTo, double amount){
        Account accountFrom = getAccountByOwnerLastName(lastNameFrom);
        Account accountTo = getAccountByOwnerLastName(lastNameTo);

        if (accountFrom==null || accountTo==null){
            return false;
        }
        if (accountFrom.withdraw(amount)){
            accountTo.deposit(amount);
            transactionsArray.addTransaction(new Transaction(accountFrom,accountTo,amount));
            return true;
        }
        return false;
    }

    public TransactionsArray getTransactionsArray() {
        return transactionsArray;
    }

    // addNewAccount - перегруженный метод (overloading)
    public void addNewAccount(Account[] arr) {
        for (int i = 0; i< arr.length; i++){
            addNewAccount(arr[i]);
        }
    }

    public void addNewAccount(Account account){
        if (size>=accounts.length){
            enlarge();
        }
         accounts[size++] = account;
    }

    private void enlarge() {
        Account[] temp = new Account[accounts.length*2];
        for (int i = 0; i < accounts.length ; i++) {
            temp[i] = accounts[i];
        }
        accounts = temp;
    }


}

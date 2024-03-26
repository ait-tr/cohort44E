public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(14,2);
        System.out.println(date);
        Person person = new Person("Jack", "Jhonson", new MyDate(20,4,2002));
        System.out.println(person);
        Account account1 = new Account("DE123456", 7452.3, person, date);
        Account account2 = new Account("DE765432", 0, person, date);
        System.out.println(account1);
        System.out.println(person.toSmallString());
        Transaction transaction = new Transaction(account1,account2, 900, new MyDate(26,3));
        System.out.println(transaction);
        System.out.println(transaction.toAccountString());
        System.out.println(transaction.toNameAccountString());
        Transactions transactions = new Transactions(1);
        transactions.addTransaction(new Transaction(account1,account2, 900, new MyDate(26,3)));
        transactions.addTransaction(new Transaction(account2,account1, 100, new MyDate(26,3)));
        transactions.addTransaction(new Transaction(account1,account2, 1900, new MyDate(26,3)));
        transactions.addTransaction(new Transaction(account1,account2, 1901, new MyDate(26,3)));
        transactions.addTransaction(new Transaction(account1,account2, 2000, new MyDate(26,3)));

        System.out.println("----------------------------------------");
        System.out.println(transactions);
        System.out.println(transactions.toStringFull());









    }
}
public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("1000001", new Person("Jack", "Vorobey"));
        Account a2 = new Account("1000002", new Person("John", "Lennon"));
        Account a3 = new Account("1000003", new Person("Jack", "Nickolson"));
        Account a4 = new Account("1000004", new Person("Ann", "Smith"));

        Account[] accounts = {a1,a2,a3,a4};
        Bank bank = new Bank("Imperial", accounts);

        System.out.println(bank);
        System.out.println("-------------------------");
        Account lennonAcc = bank.getAccountByOwnerLastName("Lennon");
        System.out.println(lennonAcc);
        bank.depositAccountByOwnerLastName("Lennon", 1000);
        bank.withdrawAccountByOwnerLastName("Lennon", 200);
        System.out.println("------------------------------");
        System.out.println(bank);


        /*

        a1.deposit(1000);
        a2.deposit(500);

        /*  Error! The balance is private
        a2.balance = -100;
        a2.balance = 1000098837
        */
        /*
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Исходный счет:");
        System.out.println(a2);
        System.out.println("Пытаемся списать 1000 Счет:");
        a2.withdraw(1000);
        System.out.println(a2);
        System.out.println("Пытаемся списать 300 Счет:");
        a2.withdraw(300);
        System.out.println(a2);

        Scanner scanner = new Scanner(System.in);
        Person person = new Person("qwer", "qwertyo");
        person.setFirstName("Ivan");
        person.setLastName("Ivanov");
        System.out.println(person);

        */

    }
}
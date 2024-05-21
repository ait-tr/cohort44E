/*

Сложное (по желанию): Допустим дан List<Account>. Класс Account определен так же как и в уроке 15:
private String iban;
private double balance;
private Person owner;
private MyDate openDate;

Ваша задача реализовать следующий функционал:
получить List<Account> всех счетов с балансом больше заданного числа
 получить List<Account> всех счетов заданного владельца




 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> accounts = List.of(
                new Account("DE0001", 1000.50, new Person("Jack", 20), new MyDate(10, 5, 2024)),
                new Account("DE0002", 8732.55, new Person("John", 28), new MyDate(1, 3, 2023)),
                new Account("DE0003", 7640.00, new Person("Bob", 23), new MyDate(19, 5, 2024)),
                new Account("DE0003", 12001.00, new Person("Bob", 23), new MyDate(11, 2, 2020)),
                new Account("DE0004", 3800.01, new Person("Tom", 10), new MyDate(2, 3, 2020)),
                new Account("DE0003", 123.00, new Person("Bob", 23), new MyDate(19, 5, 2018)),
                new Account("DE0005", 100.50, new Person("Bob", 16), new MyDate(6, 1, 2021)),
                new Account("DE0006", 300012.00, new Person("Nick", 32), new MyDate(7, 12, 2024))
        );

        printAccounts(accounts);
        System.out.println("------------------------------------------------------");
       printAccounts(getAccountsWithMoreThanGivenLimit(accounts,1500));
        System.out.println("------------------------------------------------------");
       printAccounts(getAccountsByOwner(accounts, new Person("Bob",23) ));
        System.out.println("------------------------------------------");
        printAccounts(getAccountsByOpenYear(accounts,2024));
        System.out.println("------------------------------------------");
        printAccounts(getAccountsByOwnerAge(accounts,25));

        System.out.println("-------------------------------");
        printAccounts(filterAccounts(accounts, new PredicateAccountsByOwnerName("Bob")));

        System.out.println("-------------------------------");
        printAccounts(filterAccounts(accounts, new PredicateAccountsByAge(15)));
    }

    public static void printAccounts(List<Account> accounts){
        for (Account account:accounts){
            System.out.println(account);
        }
    }

    public static  List<Account> getAccountsWithMoreThanGivenLimit(List<Account> list, double limitBalance){
        List<Account> result = new ArrayList<>();

                                                     // Перебор, итерирование
        for (Account account: list){
                                                     // отбор элементов, условие, фильтр
            if(account.getBalance()>limitBalance){
                result.add(account);                 // действие
            }
        }

        return result;
    }


    public static  List<Account> getAccountsByOwner(List<Account> list, Person owner){
        List<Account> result = new ArrayList<>();  //

        for (Account account: list){               //

            if (account.getOwner().equals(owner)){
                result.add(account);              //
            }

        }


        return result;                           //
    }

    public static  List<Account> getAccountsByOpenYear(List<Account> list, int year){
        List<Account> result = new ArrayList<>();
        for (Account account: list){
            if (account.getOpenDate().getYear()==year){    ///////////!!!!!
                result.add(account);
            }
        }
        return result;
    }

    public static  List<Account> getAccountsByOwnerAge(List<Account> list, int age){
        List<Account> result = new ArrayList<>();
        for (Account account: list){
            if (account.getOwner().getAge()<age){    ///////////!!!!!
                result.add(account);
            }
        }
        return result;
    }


    public static  List<Account> filterAccounts(List<Account> list, AccountPredicate predicate){
        List<Account> result = new ArrayList<>();
        for (Account account: list){
            if (predicate.test(account)){    ///////////!!!!!
                result.add(account);
            }
        }
        return result;
    }



}
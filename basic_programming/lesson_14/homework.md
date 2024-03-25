#1a  
Создать класс Account со следующими полями: String IBAN, double balance, Person client, MyDate open  
Person имеет следующие поля: String firstName, String lastName, MyDate birthday;
MyDate имеет следующие поля: int day, int month, int year;  
В каждом классе должен быть конструктор и метод toString()

#1b
У класса Person сделать метод toSmallString() который формирует строку вида Иванов И.

#2  
Создать класс Transaction со следующими полями: Account from, Account to, double amount, MyDate date т.е. счет плательщика, счет получателя, сумма и дата.
- Реализовать метод toString().
- Реализовать метод toAccountString() который выводит информацию о транзакции  в виде:  
2024/1/23  DE1234567  DE1234567  200
- Реализовать метод toNameAccountString() который выводит информацию о транзакции  в виде:  
2024/1/23  From: Иванов И. (DE1234567)  To: Петров А. (DE1234567)  200


#3  
Создать класс Transactions, класс, который управляет массивом транзакций. 

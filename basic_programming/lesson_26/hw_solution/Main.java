import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Product> products =new ArrayList<>();

        products.add(new Product("Kaffeemaschine (Кофемашина)", 79.99, 4.5, 10));
        products.add(new Product("Staubsauger (Пылесос)", 149.99, 4.2, 5));
        products.add(new Product("Laptop (Ноутбук)", 2000, 4.8, 3));
        products.add(new Product("Handy (Смартфон)", 450.50, 4.6, 7));
        products.add(new Product("Fernseher (Телевизор)", 399.99, 4.4, 8));
        products.add(new Product("Kühlschrank (Холодильник)", 599.99, 4.3, 4));
        products.add(new Product("Waschmaschine (Стиральная машина)", 15499.00, 1.2, 2));
        products.add(new Product("Mikrowelle (Микроволновка)", 90.00, 4.1, 9));
        products.add(new Product("Kopfhörer (Наушники)", 15.23, 4.0, 20));
        products.add(new Product("Tablet (Планшет)", 295.55, 4.5, 6));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите способ сортировки товаров:");
            System.out.println("1. Сортировка по наименованию (Bezeichnung)");
            System.out.println("2. Сортировка по цене (Preis)");
            System.out.println("3. Сортировка по рейтингу (Bewertung)");
            System.out.println("4. Сортировка по количеству на складе (Anzahl der Stücke auf Lager)");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    products.sort(new ComparatorBezeichnung());
                    System.out.println("Сортировка по наименованию:");
                    break;
                case 2:
                    products.sort(new ComparatorPreis());
                    System.out.println("Сортировка по цене:");
                    break;
                case 3:
                    products.sort(new ComparatorBewertung());
                    System.out.println("Сортировка по рейтингу:");
                    break;
                case 4:
                    products.sort(new ComparatorAnzahlDerStückeAufLager());
                    System.out.println("Сортировка по количеству на складе:");
                    break;
                case 0:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
                    continue;
            }

            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}

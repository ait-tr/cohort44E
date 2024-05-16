/*
1)  В этом задание мы будем выращивать сад (это как тамагочи, только для сада !).
Вам необходимо реализовать следующие классы: Дерево (Tree), Куст (Bush), Цветок (Flower).
    Для каждого типа растения (для дерева, для куста, для цветка) должны быть определены значения
максимального роста за сезон (см. таблицу), но реальный рост конкретного растения за сезон определяется
как случайное число не превышающее значение максимального роста за сезон.
    Например:
    Деревья за лето могут вырасти максимум на 15 см но реальный прирост конкретного дерева
может составить 3,  7 или 10 см.
                начальное       spring      summer      autumn      winter      max
                значение        весна       лето        осень       зима        высота
    tree        1.5m            15sm        15sm        5sm         5sm         5m
    деревья
    bush        40cm            10sm        10sm        3sm         0           1.5m
    кусты
    flower      0               7sm         10sm        0           0
    цветы
    Обратите внимание: для кустов и деревьев задается начальный размер саженца и максимальная высота,
после которой растение не растет.
    У каждого растение должен быть уникальный номер и название.

2)  Теперь вам необходимо реализовать класс Garden в котором будет List из всех растений.
Подсказка; Этот класс в качестве поля может иметь  int season - номер текущего сезона.
    Реализуйте в классе Garden следующие методы:
a) добавить новое растение.
b) вывести все растения на экран
c) следующий сезон: метод, который "переключает" сезон и вызывает рост растений.
Обратите внимание, метод должен переключать сезоны по-порядку, по-кругу.
*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("Apple");
        Bush bush = new Bush("Raspberry");
        Flower flower = new Flower("Rose");

        Garden garden = new Garden();
        garden.add(tree);
        garden.add(bush);
        garden.add(flower);

        System.out.println(garden);
        Garden.changeSeason();
        System.out.println(garden);
        Garden.changeSeason();
        System.out.println(garden);
        Garden.changeSeason();
        System.out.println(garden);
        Garden.changeSeason();
        System.out.println(garden);



    }


}
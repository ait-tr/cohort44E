# equals()
Метод `boolean equals()` используется для сравнения двух объектов на равенство.
Этот метод обычно переопределяется в классах, чтобы обеспечить сравнение на основе 
свойств объектов.

Например, если у вас есть класс Person, вы можете определить метод equals() 
в этом классе таким образом, чтобы сравнение двух объектов Person происходило на основе их имен, 
возраста и других характеристик. 

Иными словами, реализуя equals()  мы определяем, каким образом Java ответит на вопрос, 
равны ли два объекта между собой.    

# hashCode()
**hashCode()** - это метод, который возвращает целочисленное значение (обычно называемое хеш-кодом) 
для объекта. Хеш-код вычисляется на основе значений полей объекта. 
Объекты, которые равны согласно методу equals(), должны иметь одинаковый хеш-код. 
Однако два разных объекта могут иметь одинаковые хеш-коды (это называется коллизией), 
так что проверка на равенство по хеш-коду должна подтверждаться сравнением по методу equals().

# ArrayList

**ArrayList** - список элементов заданного типа, реализованный на основе массива.  
Объявить ArrayList можно так:
~~~java
    List<Person> list = new ArrayList<>();
~~~
в треугольных скобках указываем тип элементов листа. Основные методы:

* add() - добавить элемент
* get(index) - получить элемент по номеру
* remove(index) - удалить элемент по номеру
* set(index, newValue) - заменить существующий элемент по номеру
* size() - количество элементов
* clear() - очистить список
* contains(element) - есть ли такой элемент
* isEmpty() - пустой лист или нет
* [Материалы занятия](https://lms.ait-tr.eu/#/student-cabinet/lessons/group/cohort44E/module/basic_programming/lesson/lesson_06#code)

# Цикл while
Пока условие true выполняем *тело цикла*
Условие проверяется **перед** каждой итерацией цикла
```java
int i = 0;
while (i < 3) {
  System.out.println(i);
  i=i+1;
}
```


# Цикл for

Это ещё одна форма записи цикла, полностью ано логичная while. Пример:

```java
for (int i = 0; i < 3; i=i+1) {
  System.out.println(i);
}

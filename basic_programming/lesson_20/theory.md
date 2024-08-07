# Наследование

**Наследование** - это концепция ООП, которая позволяет создавать новые классы 
на основе уже существующих классов. Новый класс, называемый подклассом, наследником или дочерним 
классом может наследовать свойства и методы существующего класса, называемого суперклассом 
или родителем.
Подклассы могут добавлять новые методы и поля, а также
переопределять методы суперкласса для реализации специфической для них функциональности.

Преимущества использования наследования:

1. Наследование позволяет объединить разные типы данных (дочерние классы) 
в рамках одного (родительского) типа данных. Таким образом, может быть реализован общий, 
единый подход к обработке всех объектов, вне зависимости к какому из подклассов 
принадлежит конкретный объект.

2. **Переиспользование кода**. Нет необходимости дублировать общий код в
каждом из подклассов. Общий код может быть реализован в родительском классе и унаследован
всеми подклассами.

### IS-A («является»)
Давайте рассмотрим пример: есть три класса: 
*JavaProgrammer*, *PhotonProgrammer*, *JavaScriptProgrammer*. 
О любом из объектов этих классов можно сказать "является CPlusProgrammer":  
~~~
каждый JavaProgrammer является CPlusProgrammer  
каждый PhotonProgrammer является CPlusProgrammer  
каждый JavaScriptProgrammer является CPlusProgrammer
~~~  
и т.д., или на английском: *every JavaProgrammer **IS A** CPlusProgrammer*

Т.е. каждый объект JavaProgrammer, PhotonProgrammer или JavaScriptProgrammer 
является подтипом более общего класса CPlusProgrammer. Такое отношение между классам называют
отношением **IS-A**.  
Отношение IS-A («является») - основной принципом применения наследования. 
Любой дочерний класс является подтипом класса родителя или, другими словами,
любой дочерний класс **IS-A** родительский класс

## Объявление дочернего класса

Что бы объявить дочерний класс используется ключевое слово `extends`:
~~~java
public class JavaProgrammer extends CPlusProgrammer{
    
}
~~~

## Переопределение методов (overriding)

Если в дочернем классе объявить метод с тем же именем, возвращаемым типом 
и параметрами, что и метод в суперклассе, метод дочернего класса переопределит 
поведение метода родительского класса 

Такой метод называется *переопределенным* и может быть помечен как `@Override`
~~~java
public class CPlusProgrammer{
    public void writeCode(){
        System.out.println("write code");
    }
}
~~~

~~~java
public class JavaProgrammer extends CPlusProgrammer{
    @Override
    public void writeCode(){
        System.out.println("write Java code");
    }
}
~~~
В примере выше writeCode() в JavaProgrammer - переопределенный метод. Он переопределяет поведение 
родительского метода для всех JavaProgrammer. 

## Важное
1. **Тип переменной определяет доступные методы, тип значения - определяет поведение**
2. **Любой дочерний класс является подтипом класса родителя** (IS-A)
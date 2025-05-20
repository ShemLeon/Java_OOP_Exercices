**1 - class content**
для сдачи на экзамене везде добавь public для иллюзии "отдельного файла"
`interface ITwo {
void methodTwo();
}`

`interface IOne {
void methodOne();
}`

`interface IThree extends IOne {
void methodThree();
}`

`class C1 implements IOne {
@Override
public void methodOne() {
System.out.println("C1 implements IOne");
}
}`

`class C2 implements ITwo {
@Override
public void methodTwo() {
System.out.println("C2 implements ITwo");
}
}`

`class C3 implements IThree {
@Override
public void methodThree() {
System.out.println("C3 implements IThree");
}
@Override
public void methodOne() {
System.out.println("C3 implements IOne (through IThree)");
}
}`

`class C4 extends C3 implements ITwo {
@Override
public void methodTwo() {
System.out.println("C4 implements ITwo");
}
@Override
public void methodThree() {
super.methodThree();
System.out.println("C4 extends C3");
}
}`

**2 - work or mistake**
1. -- `ITwo a = new ITwo();`      --
   Интерфейсы нельзя инстанцировать напрямую. Нужен класс, реализующий интерфейс.
2. ++ `ITwo b = new C2();`     ++
   Корректно: C2 реализует ITwo, поэтому можно присвоить объект C2 переменной типа ITwo.
3. ++ `C3 c = new C4();`     ++
   Корректно: C4 наследует C3, поэтому объект C4 можно присвоить переменной типа C3 (upcasting).
4. -- `C2 d = new C4();`   --
   Некорректно: C4 и C2 не связаны напрямую в иерархии наследования. Хотя C4 реализует интерфейс ITwo (как и C2), нельзя присвоить экземпляр C4 переменной типа C2.
5. --`C4 e = new C3();` --
   Ошибка: C3 не является типом C4. Родитель не может автоматически приводиться к дочернему типу.
6. --`C4 f = (C4)(new C3());`--
   Некорректно: приведение C3 к C4 вызовет ClassCastException во время выполнения, так как объект C3 не является экземпляром класса C4

7. 
7. +- `IHasEggs he = new Bird();`
   -- he.fly(); --
Не работает, потому что Интерфейс не содержит метод `fly()`,
только тип переменной определяет доступные методы `IHasEggs`
7. `Код `g1 = g2;` сработал по следующим причинам:

1. **Иерархия типов**: Здесь происходит восходящее приведение типов (upcasting). Переменная `g1` имеет тип `IOne`, а `g2` имеет тип `C4`.

2. **C4 реализует IOne (косвенно)**: Как мы обсуждали ранее, класс C4 наследуется от C3, который реализует интерфейс IThree, а IThree расширяет IOne. Таким образом, объект типа C4 является также объектом типа IOne через цепочку наследования:

   C4 → C3 → IThree → IOne

3. **Правило полиморфизма**: В Java ссылке на интерфейс (или суперкласс) можно присвоить экземпляр любого класса, который реализует этот интерфейс (или является подклассом).

Таким образом, строка `g1 = g2;` означает: "Присвой ссылке на интерфейс IOne объект класса C4, который (косвенно) реализует IOne". Такое присваивание абсолютно корректно с точки зрения системы типов Java.

После этой операции через переменную `g1` можно будет вызывать только методы, определенные в интерфейсе IOne (в данном случае только `methodOne()`), несмотря на то, что реальный объект имеет и другие методы.`

**3.**
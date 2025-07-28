package Exercices_OOP.Mivhan.E2_2025.S2_Painter;

public class Test {
    public static void main(String[] args) {
        // --- Инициализация объектов ---
        System.out.println("\nline 1");
        Figure2D c = new Circle("red", new Point(50,50), 8);

        System.out.println("\nline 2");
        Line line = new Line("blue", new Point(100,100),  new Point(200,200));

        System.out.println("\nline 3");
        Square d2 = new Square("orange", new Point(45,45), 4);

        System.out.println("\nline 4");
        // 4. Colorable col1 = new Colorable();
        // ОШИБКА КОМПИЛЯЦИИ: Нельзя создать экземпляр интерфейса (new Colorable()).
        // Интерфейсы не могут быть инстанциированы напрямую.

        System.out.println("\nline 5");
        Rotatable rot1;

        System.out.println("\nline 6");
        Colorable col2;
        // КОРРЕКТНО: Апкастинг. Объект Square d2 присваивается ссылке на интерфейс Colorable,
        // который он реализует.
        col2 = d2;

        System.out.println("--- Анализ строк ---");

        System.out.println("\nline 7");
        rot1 = line;
        // КОРРЕКТНО: Апкастинг. Объект Line line присваивается ссылке на интерфейс Rotatable,
        // который он реализует.

        System.out.println("\nline 8");
        col2 = (Colorable) c;
        // КОРРЕКТНО: Явный апкастинг. Объект Circle c (тип Figure2D) приводится к интерфейсу
        // Colorable, который класс Circle реализует.

        System.out.println("\nline 9");
        // 9. rot1.setColor("green");
        // ОШИБКА КОМПИЛЯЦИИ: Метод setColor() не определен в интерфейсе Rotatable.
        // Переменная rot1 "видит" только методы из Rotatable (toleft, toright).

        System.out.println("\nline 10");
        col2.colortofill("red");
        // КОРРЕКТНО: col2 ссылается на объект Circle (из строки 8).
        // У интерфейса Colorable есть метод colortofill, и класс Circle его реализует.

        System.out.println("\nline 11");
        // 11. col2.toleft(Math.PI/2);
        // ОШИБКА КОМПИЛЯЦИИ: Метод toleft() не определен в интерфейсе Colorable.
        // Переменная col2 "видит" только методы из Colorable (colortofill).

        // 12. ((Square)d2).toleft(Math.PI/4);
        // КОРРЕКТНО: d2 - это объект Square, мы просто приводим его к своему же типу
        // (хотя это и избыточно) и вызываем метод toleft, который есть в Square.
        d2.toleft(Math.PI/4); // Более простой вариант без лишнего каста

        // 13. Figure2D d = c;
        // КОРРЕКТНО: Переменной типа Figure2D присваивается объект Circle, который
        // является его потомком.
        Figure2D d = c;

        // 14. ((Line)d).setColor("red");
        // ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ (RUNTIME): ClassCastException.
        // Переменная d ссылается на объект Circle. Нельзя привести Circle к Line,
        // так как это "сестринские" классы.
        // К тому же, метода setColor() нет ни в одном из классов. Вероятно, имелся в виду getColor().

        // 15. d.colortofill("Yellow");
        // ОШИБКА КОМПИЛЯЦИИ: Метод colortofill() не определен в классе Figure2D.
        // Переменная d "видит" только методы, объявленные в Figure2D (getPoint, getColor).
    }
}

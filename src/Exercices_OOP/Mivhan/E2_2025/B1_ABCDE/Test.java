package Exercices_OOP.Mivhan.E2_2025.B1_ABCDE;


public class Test {
    /***
     * Метод возвращает: Если m типа A, Если m типа B, Если m типа C, Если m типа D,Если m типа E
     * Реализуйте метод getType
     * Чтобы проверить тип объекта, следует использовать методы getX, bar, foo.
     * Нельзя использовать оператор instanceof и методы класса Object.
     * Нельзя изменять классы A, B, C, D, E.
     * Предполагается, что m принадлежит одному из классов A, B, C, D, E и не равен null.
    */
    public static int getType(Object m){
        // Сначала пытаемся проверить на самые "продвинутые" типы: C, D, E.
        // Их общая черта - наличие метода bar(). У A и B его нет.
        // Поэтому мы используем try-catch: если приведение к типу C не удастся,
        // значит, это точно A или B.
        try {
            // Приводим объект к типу C, чтобы получить доступ к методам.
            // Если 'm' - это A или B, здесь произойдет ClassCastException.
            C obj = (C) m;
            int fooValue = obj.foo();
            int barValue = obj.bar();

            // Теперь у нас есть значения foo() и bar(), и мы можем различить C, D, E.

            // Проверяем на E: у него foo() от C (x+2), а bar() свой (x+1).
            // Поэтому foo == bar + 1
            if (fooValue == barValue + 1) {
                return 5; // Это E
            }

            // Проверяем на D: у него foo() свой (x-1), а bar() от C (x).
            // Поэтому foo == bar - 1
            if (fooValue == barValue - 1) {
                return 4; // Это D
            }

            // Если это не D и не E, а приведение к C удалось, значит, это C.
            return 3; // Это C

        } catch (ClassCastException e) {
            // Мы попали сюда, значит, 'm' - это не C и не его потомки (D, E).
            // Остались только варианты A или B.
            // Приводим к типу A, так как B является его потомком.
            A obj = (A) m;
            int fooValue = obj.foo();
            int xValue = obj.getX();

            // Проверяем на B: у него foo() свой (x+1), а getX() от A (x).
            // Поэтому foo == getX + 1
            if (fooValue == xValue + 1) {
                return 2; // Это B
            }

            // Если это не B, то по условию задачи остается только A.
            return 1; // Это A
        }

    }
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(10);
        C c = new C(10);
        D d = new D(10);

        System.out.println("Тип объекта a: " + getType(a)); // Ожидаем 1
        System.out.println("Тип объекта b: " + getType(b)); // Ожидаем 2
        System.out.println("Тип объекта c: " + getType(c)); // Ожидаем 3
        System.out.println("Тип объекта d: " + getType(d)); // Ожидаем 4

        A a1 = new B(); // A.x = 9
        A a2 = new E(); // A.x = 9
        A a3 = new D(); // A.x = 9 D.x = 10
        A a4 = new D(5); // A.x = 5 D.x = 5
        A a5 = new D(3,7); // A.x = 9 D.x = 19
    }
}

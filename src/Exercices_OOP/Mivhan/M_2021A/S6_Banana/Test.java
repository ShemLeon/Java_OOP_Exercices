package Exercices_OOP.Mivhan.M_2021A.S6_Banana;

public class Test {
    public static void main(String[] args) {
        Apple a1 = new Apple (10);
        Object a2 = new Apple (10);
        Banana b1 = new Banana (10);
        Object b2 = new Banana (10);

//   1.System.out.println(a1.weight); ошибка compilation. private.
//   2.System.out.println (((Banana)a2).getWeight()); // **runtime error** `ClassCastException`
        System.out.println ("a1.equals(a2)="+ a1.equals(a2)); // false; - метод сравнивает епл и епл.
        System.out.println (a1.equals((Apple)a2)); // true; - Вызывается **перегруженный** метод
        // Приведение типа `(Apple)a2` заставляет компилятор выбрать перегруженный метод `equals(Apple)`, который сравнивает по содержимому, а не по ссылкам.

        System.out.println (a2.equals(a1)); // false
        System.out.println ("b1.equals(b2)="+b1.equals(b2)); // true - метод сравнивает банан и обжект
        System.out.println ("b2.equals(b1)="+b2.equals(b1)); // true
        // - `b2` имеет тип `Object`, но содержит объект `Banana`
        // - Вызывается переопределенный метод `equals` из класса `Banana`
        System.out.println (a1.equals((Banana)b2)); // false
        /* не ошибка. оно идет в метод родительского класса Object.equals(Object)
               public boolean equals(Object obj) {
                    return (this == obj);  // Сравнение ссылок
               }       */
        System.out.println((b1.equals((Apple)a2)));
        System.out.println (a1.equals(a2)); // false;
        // Компилятор ищет метод `equals(Object)` В классе такого метода нет! `Apple`
        // Вызывается унаследованный `Object.equals(Object)`
//  10. System.out.println (b1.equals((Banana)a2));  // **runtime error** `ClassCastException`
    }

}

package Exercices_OOP._8_Interface.t0_ABC;// import unit4.collectionsLib.Node;


public class Test {
    public static void main(String[] args) {
        int x;
        String y;
        C b1 = new B(); //  `B` является подклассом `C`, поэтому переменная типа `C` может ссылаться на объект типа `B` (полиморфизм).
        A[] arrA = new A[3]; // массив, который может содержать ссылки на объекты, реализующие интерфейс `A`.
        //  arrA[0] = new B(x,y); ERROR: COMPILATION - x обьявлен, но не инициализирован
        arrA[1] = new B(); // `B` реализует интерфейс `A` (через наследование от `C`).
        arrA[2] = new C(); // `C` напрямую реализует интерфейс `A`
        //  arrA[0].f(); ERROR: NullPointerException - 1. `arrA[0]` не был проинициализирован (из-за ошибки в строке выше), поэтому по умолчанию содержит `nul`
        arrA[2].g();
        arrA[1].h();
    }
}

package Exercices_OOP._10_Exception.teory.t5_calculator;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // Тест вычитания с отрицательным результатом
        try {
            int result = calc.subtract(10, 20);
            System.out.println("10 - 20 = " + result);
        } catch (Exception e) {
            System.out.println("Вычитание: " + e.getMessage());
        }
        System.out.println("qweqwe");
    }
}

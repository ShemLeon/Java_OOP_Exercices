package Exercices_OOP._10_Exception.teory.t5_calculator;// import unit4.collectionsLib.Node;

public class Calculator {
    // Проверка валидности числа
    private void validateNumber(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Ошибка: Отрицательные числа запрещены!");
        }
        if (number > 100) {
            throw new Exception("Ошибка: Числа больше 100 запрещены!");
        }
    }
    // Вычитание
    public int subtract(int a, int b) throws Exception {
        validateNumber(a);
        validateNumber(b);
        int result = a - b;
        validateNumber(result);
        return result;
    }
    // Деление
    public int divide(int a, int b) throws Exception {
        validateNumber(a);
        validateNumber(b);
        if (b == 0) {
            throw new Exception("Ошибка: Деление на ноль запрещено!");
        }
        int result = a / b;
        validateNumber(result);
        return result;
    }
}

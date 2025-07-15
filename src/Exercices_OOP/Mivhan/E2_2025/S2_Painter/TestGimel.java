package Exercices_OOP.Mivhan.E2_2025.S2_Painter;


public class TestGimel {
    public static int handleFigures(Figure2D[] arr) {
        Figure2D curr;
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            curr = arr[i];
            // ЗАДАНИЕ 1: Напечатать координаты синих фигур
            // Используем "blue".equals(...) для безопасного и правильного сравнения строк
            if ("blue".equals(curr.getColor())) {
                System.out.print(curr.getPoint());
            }
            // либо
            if (curr.getColor().compareTo("blue")==0)  System.out.print(curr.getPoint());

            // ЗАДАНИЕ 2: Если форму можно заполнить, заполнить цветом "red"
            if (curr instanceof Colorable) {
                Colorable c = (Colorable) curr;
                c.colortofill("red");
            }
            // ЗАДАНИЕ 3: Повернуть фигуру на 30 градусов влево, если возможно
            if (curr instanceof Rotatable) {
                Rotatable r = (Rotatable) curr;
                r.toleft(30);
            }
            // ЗАДАНИЕ 4: Если это Circle, напечатать радиус
            if (curr instanceof Circle) {
                 System.out.println( ((Circle)curr).getRadius() );
            }
            // ЗАДАНИЕ 5: Если это Line, напечатать вторую точку
            if (curr instanceof Line) {
                System.out.println(((Line) curr).getCoord2());
            }
            // ЗАДАНИЕ 6: Подсчет фигур, которые можно повернуть, но нельзя закрасить
            if (curr instanceof Rotatable && !(curr instanceof Colorable)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Напиши ф-ю, которая принимает в себя массив обьектов типа Figure2D и выполняет действия:
        // 1. напечатает cood1 всех форм с цветом "blue"
        // 2. если форму можно заполнить (импл интерфейс колорабл) - заполни цветом "red"

        // Создаем различные фигуры с разными цветами
        // Создаем 8 тестовых фигур
        Figure2D[] figures = new Figure2D[8];

        figures[0] = new Circle("blue", new Point(10, 10), 5);
        figures[1] = new Circle("red", new Point(20, 20), 8);
        figures[2] = new Square("blue", new Point(30, 30), 4);
        figures[3] = new Square("green", new Point(40, 40), 6);
        figures[4] = new Line("blue", new Point(50, 50), new Point(60, 60));
        figures[5] = new Line("yellow", new Point(70, 70), new Point(80, 80));
        figures[6] = new Circle("blue", new Point(90, 90), 7);
        figures[7] = new Square("purple", new Point(100, 100), 5);

        System.out.println(" "+handleFigures(figures));

    }
}
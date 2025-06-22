package Exercices_OOP._7_Abstract.t1_Shapes;

import java.awt.*;

public class Test_Shape {
    public static void main(String[] args) {
        Point p1 = new Point(5, 6);
        // Используем предопределенный цвет вместо Color(5)
        Color color1 = Color.RED;
        Circle c1 = new Circle(p1, color1,4);
        System.out.println("Площадь круга: " + c1.area());
    }
}

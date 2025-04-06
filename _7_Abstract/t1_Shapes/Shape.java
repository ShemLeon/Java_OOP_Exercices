package Exercices_OOP._7_Abstract.t1_Shapes;

import java.awt.*;

public abstract class Shape {
    protected Point location;
    protected Color color;
    public Shape(Point p, Color c){
        this.location = p;
        this.color = c;
    }
    public abstract void draw(Graphics g);

    public abstract double area();
    

    public static void main(String[] args) {
        Point p1 = new Point(5, 6);
        // Используем предопределенный цвет вместо Color(5)
        Color color1 = Color.RED;
        Circle c1 = new Circle(p1, 4, color1);
        System.out.println("Площадь круга: " + c1.area());
    }
}

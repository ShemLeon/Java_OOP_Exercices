package Exercices_OOP._7_Abstract.t1_Shapes;
import java.awt.*;

public class Circle extends Shape {
    private int radius;
    public Circle(Point p, Color c, int radius) {
        super(p, c);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(super.color);
        g.drawArc(
                (int) (super.location.getX() - this.radius),
                (int) (super.location.getY() - this.radius),
                2*this.radius,
                2*this.radius,
                0,
                360
        );
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

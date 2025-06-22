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
}

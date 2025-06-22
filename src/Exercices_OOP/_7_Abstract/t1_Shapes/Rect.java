package Exercices_OOP._7_Abstract.t1_Shapes;

import java.awt.*;

public class Rect extends Shape{
    private int width;
    private int height;
    public Rect(Point p, Color c, int w, int h) {
        super(p, c);
        this.width = w;
        this.height = h;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(super.color);
        g.drawRect((int) super.location.getX(), (int) super.location.getY(), this.width, this.height);
    }

    @Override
    public double area() {
        return 0;
    }

}

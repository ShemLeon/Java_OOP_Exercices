package Exercices_OOP._7_Abstract.t1_Shapes;

import java.awt.*;

/**
 * Класс Circle - конкретная реализация абстрактного класса Shape
 * Представляет круг в графическом интерфейсе
 */
public class Circle extends Shape {
    private int radius;

    /**
     * Конструктор круга
     * @param p центр круга
     * @param r радиус круга
     * @param c цвет круга
     */
    public Circle(Point p, int r, Color c) {
        super(p, c);
        this.radius = r;
    }

    /**
     * Метод для рисования круга
     * @param g графический контекст
     * Принцип работы:
     * 1. Устанавливаем цвет
     * 2. Рисуем окружность с помощью drawArc
     */
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

    /**
     * Метод для вычисления площади круга
     * @return площадь круга
     * Принцип работы:
     * 1. Используем формулу π * r^2
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Получить радиус круга
     * @return радиус
     */
    public int getRadius() {
        return radius;
    }
    
    /**
     * Установить радиус круга
     * @param radius новый радиус
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
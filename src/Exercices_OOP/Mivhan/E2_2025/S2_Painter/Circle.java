package Exercices_OOP.Mivhan.E2_2025.S2_Painter;// import unit4.collectionsLib.Node;

public class Circle extends Figure2D implements Colorable{
  private int radius;
  public Circle(String color, Point point, int radius) {
      this.color = color;
      this.cood1 = point;
      this.radius = radius;
  }
  public void colortofill(String color) {
      this.color = color;
  }

  public Circle(int radius) {
        this.radius = radius;
  }

    public int getRadius() {
        return radius;
    }
}

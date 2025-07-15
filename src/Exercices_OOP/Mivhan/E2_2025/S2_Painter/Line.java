package Exercices_OOP.Mivhan.E2_2025.S2_Painter;// import unit4.collectionsLib.Node;

public class Line extends Figure2D implements Rotatable{
  private Point coord2;
  public Line(String color, Point p1, Point p2) {
        this.color = color;
        this.cood1 = p1;
        this.coord2 = p2;
    }

    public Point getCoord2() {
        return coord2;
    }

    public void toleft(double degree) {}
  public void toright(double degree) {}
}

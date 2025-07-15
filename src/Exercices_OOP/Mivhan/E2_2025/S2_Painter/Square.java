package Exercices_OOP.Mivhan.E2_2025.S2_Painter;// import unit4.collectionsLib.Node;

public class Square extends Figure2D implements Colorable, Rotatable{
  protected int edge;

    public Square(String color, Point point, int edge) {
        this.color = color;
        this.cood1 = point;
        this.edge = edge;
    }
    public Square(int edge) {
        this.edge = edge;
    }

    public void colortofill(String color) {};
  public void toleft(double degree) {}
  public void toright(double degree) {}
}

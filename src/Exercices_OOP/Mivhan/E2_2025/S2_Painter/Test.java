package Exercices_OOP.Mivhan.E2_2025.S2_Painter;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Figure2D c = new Circle("red", new Point(50,50), 8);
        Line line = new Line("blue", new Point(100,100),  new Point(200,200));
        Square d2 = new Square("orange", new Point(45,45), 4);
        // 4. Colorable col1 = new Colorable(); - compilation error
        Rotatable rot1;
        Colorable col2 = d2;
        rot1 = line;
        col2 = (Colorable) c;
        // 9. rot1.setColor("green"); - compilation error
        col2.colortofill("red");
        // 11. col2.toleft(Math.PI/2); - compilation error
        ((Square)d2).toleft(Math.PI/4);
        Figure2D d = c;
        // 14. ((Line)d).setColor("red"); - runtime
        // 15. d.colortofill("Yellow");- compilation error
    }
}

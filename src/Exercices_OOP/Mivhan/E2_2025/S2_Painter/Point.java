package Exercices_OOP.Mivhan.E2_2025.S2_Painter;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x:"+x+ "; y"+y+")";
    }
}

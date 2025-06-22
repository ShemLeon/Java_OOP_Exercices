package Exercices_OOP._6_Polymorphism.XYZ_casting;// import unit4.collectionsLib.Node;

public class XYZ {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();
        X xy = new Y(); // upcasting+
        X xz = new Z(); // upcasting+
    //  Y yz = new Z(); // ERROR: compilation
    //  Y y1 = new X(); // ERROR: compilation
    //  Z z1 = new X(); // ERROR: compilation
        X x1 = y; // upcasting+
        X x2 = z; // upcasting+
    //  Y y1 = (Y)x; // downcasting- ERROR: ClassCastException
    //  Z z1 = (Z)x;
        Y y2 = (Y)x1; // downcasting+
        Z z2 = (Z)x2; // downcasting+
    //  Y y3 = (Y)z;  // ERROR: compilation
        Object o = z; // upcasting+
    //  Object o1 = (Y)o; // downcasting- ERROR: ClassCastException
    }
}

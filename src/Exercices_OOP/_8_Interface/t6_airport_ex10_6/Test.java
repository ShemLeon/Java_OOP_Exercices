package Exercices_OOP._8_Interface.t6_airport_ex10_6;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Plane p1 = new Plane("London", "Paris",1,  3);
        Train t1 = new Train("Berdichev", "Kiev",101,  20);
        System.out.println(p1.details());
        System.out.println(t1.details());
    }
}

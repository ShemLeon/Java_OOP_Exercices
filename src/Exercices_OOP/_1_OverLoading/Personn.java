package Exercices_OOP._1_OverLoading;// import unit4.collectionsLib.Node;

public class Personn {

    public static int count = 0;
    public Personn() {
        count++;
    }
    public static void main(String[] args) {
        Personn p1 = new Personn();
        Personn p2 = new Personn();
        System.out.println("Total persons: " + Personn.count);
        // Total persons: 2
    }
}

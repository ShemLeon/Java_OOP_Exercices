package Exercices_OOP._8_Interface.t0_fly;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Flyable fly = new Bird("Soroka", 1, "black");
        fly.startFlying(); // Soroka FLY!!!
        System.out.println(Flyable.MAX_ALTITUDE);
        Bird bird1 = new Bird("Vorona", 2, "White");
        System.out.println(bird1.MAX_ALTITUDE);
    }
}

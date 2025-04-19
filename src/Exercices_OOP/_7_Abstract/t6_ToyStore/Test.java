package Exercices_OOP._7_Abstract.t6_ToyStore;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Test {
    public static void main(String[] args) {
        Toy[] toys = new Toy[6];
        toys[0] = new Dolly("Dolly1", 100, 3, 20);
        toys[1] = new Dolly("Dolly2", 120, 2, 25);
        toys[2] = new TeddyBear("Teddy1", 80, "Red", true);
        toys[3] = new TeddyBear("Teddy2", 90, "Blue", false);
        toys[4] = new RobotToy("Robot1", 200, true, true, 15);
        toys[5] = new RobotToy("Robot2", 250, false, true, 8);
        for (int i=0; i<toys.length;i++)
            System.out.println(toys[i].toString());
    }
}

package Exercices_OOP._8_Interface.t3_animals_ex10_2;


public class Test {
    public static void main(String[] args) {
        Animal a = new Bat();    // 1. ++

    //  Fish f = new IHasEggs(); // 2. --

        ICanFly cf = new Bird(); // 3. ++
        cf.fly(); // Bird can fly
        cf = new Bat();
        cf.fly(); // Bat can fly

        Mammal m = new Bat(); // 4. +-
    //  m.fly();              // --
        ((Bat)m).fly();  // Bat can fly
        Animal a2 = new Bird(); // 5. ++
        ((Bird)a2).fly();

        IHasEggs he = new Bird(); // 6. +-
    //  he.fly();                 // --



    }
}

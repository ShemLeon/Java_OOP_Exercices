package Exercices_OOP._8_Interface.t3_animals_ex10_2;


public class Test {
    public static void main(String[] args) {
        Animal a = new Bat();    // 1. ++ Polymorphism
    //  Fish f = new IHasEggs(); // 2. -- ERROR: Compilation
        ICanFly cf = new Bird(); // 3. ++ Переменная интерфейса может ссылаться на любой объект, реализующий этот интерфейс.
        cf = new Bat();
        cf.fly();

        Mammal m = new Bat(); // 4. +-
    //  m.fly();              // --  ERROR: Compilation
        ((Bat)m).fly();       // +

        Animal a2 = new Bird(); // 5. ++ Polymorphism and type casting
        ((Bird)a2).fly();

        IHasEggs he = new Bird(); // 6. +-
    //  he.fly();                 // -- ERROR: Compilation
        he.layingEggs();          // +
    }

    // 3
    public int printICanFly(Animal[] animals){
        int count = 0;
        for (int i=0; i<animals.length; i++){
            if (animals[i] instanceof ICanFly) count++;
        }
        return count;
    }
}



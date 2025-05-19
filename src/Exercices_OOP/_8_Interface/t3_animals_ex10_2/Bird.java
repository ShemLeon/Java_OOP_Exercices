package Exercices_OOP._8_Interface.t3_animals_ex10_2;

public class Bird extends Animal implements IHasEggs, ICanFly{
    public void layingEggs() {
        System.out.println("Bird has eggs");
    }
    public void fly() {
        System.out.println("Bird can fly");
    }
}

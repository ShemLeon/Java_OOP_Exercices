package Exercices_OOP._8_Interface.t3_animals_ex10_2;

public class Bat extends Mammal implements ICanFly {
    public void fly() {
        System.out.println("Bat can fly");
    }
}

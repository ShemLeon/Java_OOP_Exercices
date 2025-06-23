package Exercices_OOP._8_Interface.t0_fly;// import unit4.collectionsLib.Node;
import Exercices_OOP._4_Maarah.Animall;

public abstract class Bird implements Flyable {
    public void eat(){
        System.out.println("Bird is eating");
    }
    public abstract void makeSound();
    // fly() - остается наследнику.
}

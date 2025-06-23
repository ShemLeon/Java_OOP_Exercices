package Exercices_OOP._8_Interface.t0_fly;// import unit4.collectionsLib.Node;
import Exercices_OOP._4_Maarah.Animall;

public class Bird extends Animall implements Flyable {
    public Bird(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void startFlying() {
        System.out.println(getName()+" FLY!!!");
    }

    @Override
    public void fly(double distance) {

    }

}

package Exercices_OOP._8_Interface.t0_fly;// import unit4.collectionsLib.Node;

public class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Eagle soars high");
    }
    @Override
    public void makeSound() {
        System.out.println("Eagle screeches!");
    }
}

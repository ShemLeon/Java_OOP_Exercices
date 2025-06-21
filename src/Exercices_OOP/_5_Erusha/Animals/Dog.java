package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Dog extends Mammal{
    protected int bonesToEat;
    public Dog(String name, String gender, double milk, int bonesToEat) {
        super(name, gender, milk);
        this.bonesToEat =bonesToEat;
    }

    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}

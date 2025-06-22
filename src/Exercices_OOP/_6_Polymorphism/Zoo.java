package Exercices_OOP._6_Polymorphism;// import unit4.collectionsLib.Node;

import Exercices_OOP._5_Erusha.Animals.Animal;
import Exercices_OOP._5_Erusha.Animals.Mammal;

public class Zoo {

    public static void main(String[] args) {
        Animal[] zoo = new Animal[4];
        zoo[0] = new Animal ("Joe" , "M");
        zoo[1] = new Mammal("Snow" , "F" , 25);
        zoo[2] = new Mammal ("Mitzi", "F", 30);
        zoo[3] = new Animal ("Bob" , "M");

    }
}


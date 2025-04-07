package Exercices_OOP._7_Abstract.t5_trek;
import unit4.collectionsLib.Node;

public class TrekTest {
    public static void main(String[] args) {
        // Create a list of treks according to the task example
        Node<Trek> treks = new Node<Trek>(
            new MountainTrek("Annapurna", "Nepal", 10, 5000),
            new Node<Trek>(new DesertTrek("Desert sands", "Morocco", 5, 40)));
            
        // Print information about each trek
        Node<Trek> pos = treks;
        while (pos != null) {
            pos.getValue().printDetails();
            System.out.println("");
            System.out.println("->");
            pos = pos.getNext();
        }
        
        // Demonstration of creating additional treks
        Trek mountainTrek2 = new MountainTrek("Everest", "Nepal", 15, 8000);
        Trek desertTrek2 = new DesertTrek("Sahara", "Egypt", 7, 45.5);
        
        System.out.println("\nAdditional treks:");
        mountainTrek2.printDetails();
        System.out.println("");
        System.out.println("->");
        desertTrek2.printDetails();
    }
}

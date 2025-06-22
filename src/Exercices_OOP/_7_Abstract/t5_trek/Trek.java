package Exercices_OOP._7_Abstract.t5_trek;
import unit4.collectionsLib.Node;

public abstract class Trek {
    private String name;
    private String location;
    private int duration;

    public Trek(String name, String location, int duration) {
        this.name = name;
        this.location = location;
        this.duration = duration;
    }

    public abstract String getDifficulty();
    public abstract Node<String> getRequiredEquipment();

    // Prints trek details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Difficulty: " + getDifficulty());
        
        System.out.print("Required Equipment: ");
        Node<String> equipment = getRequiredEquipment();
        while (equipment != null) {
            System.out.print(equipment.getValue() + ", ");
            equipment = equipment.getNext();
        }
        System.out.println();
    }
}

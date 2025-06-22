package Exercices_OOP._7_Abstract.t5_trek;
import unit4.collectionsLib.Node;

public class MountainTrek extends Trek {
    private int maxAltitude; // maximum altitude of the trek in meters

    public MountainTrek(String name, String location, int duration, int maxAltitude) {
        super(name, location, duration);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public String getDifficulty() {
        return "Hard";
    }

    @Override
    public Node<String> getRequiredEquipment() {
        // Create equipment list for mountain trek
        return new Node<>("Warm coat", new Node<>("Walking sticks", new Node<>("Climbing shoes")));
    }


    public int getMaxAltitude() {
        return maxAltitude;
    }
    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
}

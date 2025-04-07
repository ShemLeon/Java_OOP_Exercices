package Exercices_OOP._7_Abstract.t5_trek;
import unit4.collectionsLib.Node;

public class MountainTrek extends Trek {
    private int maxAltitude; // maximum altitude of the trek in meters

    public MountainTrek(String name, String location, int duration, int maxAltitude) {
        super(name, location, duration);
        this.maxAltitude = maxAltitude;
    }

    /**
     * Returns the difficulty level of the mountain trek - always "Hard"
     * @return string "Hard"
     */
    @Override
    public String getDifficulty() {
        return "Hard";
    }

    /**
     * Returns the list of required equipment for mountain trek
     * @return equipment list as a linked list
     */
    @Override
    public Node<String> getRequiredEquipment() {
        // Create equipment list for mountain trek
        return new Node<>("Warm coat", new Node<>("Walking sticks", new Node<>("Climbing shoes")));
    }

    /**
     * Get the maximum altitude of the trek
     * @return maximum altitude in meters
     */
    public int getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Set the maximum altitude of the trek
     * @param maxAltitude new maximum altitude in meters
     */
    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
}

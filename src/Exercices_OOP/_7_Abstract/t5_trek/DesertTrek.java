package Exercices_OOP._7_Abstract.t5_trek;
import unit4.collectionsLib.Node;

public class DesertTrek extends Trek {
    private double temperature;


    public DesertTrek(String name, String location, int duration, double temperature) {
        super(name, location, duration);
        this.temperature = temperature;
    }

    @Override
    public String getDifficulty() {
        return "Medium";
    }

    @Override
    public Node<String> getRequiredEquipment() {
        return new Node<>("Sunscreen", new Node<>("Wide hat"));
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

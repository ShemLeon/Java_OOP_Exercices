package Exercices_OOP._9_Enum.teory;

public enum TrafficLight {
    RED("Stop"),
    GREEN("Drive"),
    YELLOW("Ready");

    private final String meaning;

    TrafficLight(String meaning){
        this.meaning = meaning;
    }

    public String getMeaning(){
        return meaning;
    }
    public static void main(String[] args){
        System.out.println(TrafficLight.RED.getMeaning()); // Stop
    }
}

package Exercices_OOP._9_Enum.teory;

public enum _2_TrafficLight {
    RED("Stop"),
    GREEN("Drive"),
    YELLOW("Ready");

    private final String meaning;

    _2_TrafficLight(String meaning){
        this.meaning = meaning;
    }

    public String getMeaning(){
        return meaning;
    }

    public static void main(String[] args){
        System.out.println(_2_TrafficLight.RED.getMeaning()); // Stop
        System.out.println(_2_TrafficLight.RED); // RED
    }
}

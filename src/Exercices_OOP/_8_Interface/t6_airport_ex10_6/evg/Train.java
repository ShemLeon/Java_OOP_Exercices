package Exercices_OOP._8_Interface.t6_airport_ex10_6.evg;

public class Train extends Vehicle {
    private int maxPas;

    public Train(String source, String destination, int id, int maxPas) {
        super(id, source, destination);
        this.maxPas = maxPas;
    }

    public String getType() {
        return "Train";
    }

    public String details() {
        return "Movable Type: Train\nNumber " + id +
                "\nSource = " + source +
                "\nDestination = " + destination +
                "\nPassengers: " + maxPas + "\n------";
    }

    public int compareTo(Object o) {
        Train other = (Train) o;
        return Integer.compare(this.maxPas, other.maxPas);
    }
}

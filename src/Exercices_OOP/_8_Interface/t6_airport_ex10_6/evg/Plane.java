package Exercices_OOP._8_Interface.t6_airport_ex10_6.evg;

public class Plane extends Vehicle {
    private int height;

    public Plane(String source, String destination, int id, int height) {
        super(id, source, destination);
        this.height = height;
    }

    public String getType() {
        return "Plane";
    }

    public String details() {
        return "Movable Type: Plane\nNumber " + id +
                "\nSource = " + source +
                "\nDestination = " + destination +
                "\nMax altitude: " + height + "\n------";

    }

    public int compareTo(Object o) {
        Plane other = (Plane) o;
        return Integer.compare(this.height, other.height);
    }
}

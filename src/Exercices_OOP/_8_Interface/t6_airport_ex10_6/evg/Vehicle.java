package Exercices_OOP._8_Interface.t6_airport_ex10_6.evg;

public abstract class Vehicle implements Movable, Comparable<Object> {
    protected int id;
    protected String source;
    protected String destination;

    public Vehicle(int id, String source, String destination) {
        this.id = id;
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void move() {
        String temp = source;
        source = destination;
        destination = temp;
    }

    public abstract String getType();
    public abstract String details();

}

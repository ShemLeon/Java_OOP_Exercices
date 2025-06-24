package Exercices_OOP._8_Interface.t6_airport_ex10_6;// import unit4.collectionsLib.Node;

public abstract class Vehicle implements Movable, Comparable {
    private int id;
    private String source;
    private String destination;
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
    public abstract String getType();
    public abstract int compareTo(Object o);
    public void move() {
        String temp = source;
        source = destination;
        destination = temp;
        }
    public String details() {
        return  "Number ["+ this.id + "]\n"+
                "Source = [" + source + "]\n"+
                "Destination =[" + destination + "]"                ;
    }
}


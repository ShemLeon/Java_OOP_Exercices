package Exercices_OOP._8_Interface.t6_airport_ex10_6;// import unit4.collectionsLib.Node;

public class Plane extends Vehicle{
    private int height;
    private String origPoint;
    private String finalPoint;
    private int id;
    private String type = "Plane";

    public Plane(int id, String source, String destination, int height) {
        super(id, source, destination);
        this.id = id;
        this.height = height;
        this.origPoint = source;
        this.finalPoint = destination;

    }

    public String getType() {
        return type;
    }

    public int compareTo(Object o){
        return 0;
    }

    public String details(){
        return  "Movable Type: " + getType()+ "\n"+
                super.details() + "\n"+
                "Max altitude: [" + height + "]" +"\n";
    }
}

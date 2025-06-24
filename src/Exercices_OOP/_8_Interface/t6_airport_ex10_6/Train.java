package Exercices_OOP._8_Interface.t6_airport_ex10_6;// import unit4.collectionsLib.Node;

public class Train extends Vehicle{
    private int maxPas;
    private String source;
    private String destination;
    private int id;
    private String type = "Train";

    public Train(String source, String destination, int maxPas, int id) {
        super(id, source, destination);
        this.id = id;
        this.maxPas = maxPas;
        this.source = source;
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public int compareTo(Object o){
        if (!(o instanceof Train)) return 0;
        Train other = (Train) o;
        return Integer.compare(this.maxPas, other.maxPas);
    }

    public String details(){
        return  "Movable Type: " + getType()+ "\n"+
                super.details() + "\n"+
                "Passengers: [" + maxPas + "]" +"\n";
    }
}

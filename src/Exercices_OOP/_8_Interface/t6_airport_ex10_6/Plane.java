package Exercices_OOP._8_Interface.t6_airport_ex10_6;

public class Plane extends Vehicle{
    private int height;
    private String origPoint;
    private String finalPoint;
    private int id;
    private String type = "Plane";

    public Plane(String source, String destination, int height, int id) {
        super(id, source, destination);
        this.id = id;
        this.height = height;
        this.origPoint = source;
        this.finalPoint = destination;

    }

    public String getType() {
        return type;
    }

    public String details(){
        return  "Movable Type: " + getType()+ "\n"+
                super.details() + "\n"+
                "Max altitude: [" + height + "]" +"\n";
    }

    // если параметр основного объекта выше чем сравниваемого - вернет 1
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Plane)) return 0;
        Plane other = (Plane) o;
        return Integer.compare(this.height, other.height);
    }
}

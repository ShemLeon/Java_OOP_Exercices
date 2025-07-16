package Exercices_OOP.Mivhan.M_2021A.S1_TabletHanut;


public class Tablet {

    private String name;
    private String kind;
    private OperatingSystem system; // сюда поставить ENUM
    private double size;
    private double price;

    public Tablet(String name, String kind,  char systemCode, double size, double price) {
        this.name = name;
        this.kind = kind;
        this.system = OperatingSystem.fromCode(systemCode);
        this.size = size;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public OperatingSystem getSystem() {
        return system;
    }
    public void setSystem(OperatingSystem system) {
        this.system = system;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", system=" + system +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
    public boolean isSame(Tablet other){
        if (other.getName().equals(this.getName())
                && other.getSize() == (this.getSize())
                && other.getKind().equals(this.getKind())
        ) return true;
        return false;
    }



    public static void main(String[] args) {
        Tablet t1 = new Tablet("planet", "Dor123", 'I', 1024, 50000);
        Tablet t2 = new Tablet("planet", "Dor123", 'A', 1024, 50000);
        Tablet t3 = new Tablet("mars", "123", 'A', 1024, 50000);
        System.out.println("Планшет 1: " + t1);
        System.out.println("Планшет 2: " + t2);

        System.out.println(t1.isSame(t2));
        System.out.println(t1.isSame(t3));
    }
}

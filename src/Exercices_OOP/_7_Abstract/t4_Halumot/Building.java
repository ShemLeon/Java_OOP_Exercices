package Exercices_OOP._7_Abstract.t4_Halumot;
import unit4.collectionsLib.Node;

public class Building {
    private int floors;
    private int totalApa;
    private Node<Apartment> apas;
    // Constructor
    public Building(int f, int tA) {
        this.floors = f;
        this.totalApa = tA;
        this.apas = null;
    }

    public void printAvailableApasInRange(int minP, int maxP){
        /*
        @in: int minPrice, int maxPrice
        @out - print all available apartment in range price >= minP && price <= maxP
         */
        Apartment a;
        Node<Apartment> temp = this.apas;

        while (temp != null){
            a = temp.getValue();
            if (a.isAvailable() && a.getFinalPrice()>minP
                                && a.getFinalPrice()<maxP
            ) System.out.println(a.toString());
            temp = temp.getNext();
        }
    }

    public boolean sell(int num){
        /*
        @in: int num - Flat number
        @out: sell apa num
         */
        boolean sold = false;
        Node<Apartment> temp = this.apas;
        Apartment a;
        while (temp != null && !sold) {
            a = temp.getValue();
            if (a.getNum() == num && a.isAvailable()) {
                sold = true;
                a.soldFlat();
            }
            temp = temp.getNext();
        }
        return sold;
    }


    public void addFlat(Apartment a) {
        Node<Apartment> newNode = new Node<>(a);
        if (this.apas == null){
            this.apas = newNode;
            return;
        }
        Node<Apartment> current = this.apas;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
    }


    public int avgSimpleSoldNoDiscount(){
        Node<Apartment> temp = this.apas;
        Apartment a;
        int avg = 0, sum=0, count = 0;

        while (temp!=null){
            a=temp.getValue();
            if (a instanceof Simple) {
                if (!a.isAvailable() && ((Simple)a).getDiscount()==0 ){
                    count++;
                    sum+= a.getFinalPrice();
                }
            }
            temp = temp.getNext();
        }

        if (count==0) return -1;
        avg = sum/count;
        return avg;
    }

    public static void main(String[] args) {
        // Create flats
        Simple s1 = new Simple(101,1,5,1000000,true,5);
        Simple s2 = new Simple(15,1,3,3000,false,0);
        Simple s3 = new Simple(16,1,3,4000,false,0);
        Garden g1 = new Garden(102,0,4,800000, true, 25);
        Duplex d1 = new Duplex(103,9,6,1500000,true,2);
        Duplex d2 = new Duplex(104,1,3,1000,false,2);
        // create building
        Building ourBuild1 = new Building(4, 10);
        ourBuild1.addFlat(s1);
        ourBuild1.addFlat(s2);
        ourBuild1.addFlat(s3);
        ourBuild1.addFlat(g1);
        ourBuild1.addFlat(d1);
        ourBuild1.addFlat(d2);

        // avg simple sold flats without discount:
        System.out.println("Average price Simple Flats without discount: " + ourBuild1.avgSimpleSoldNoDiscount());

        // sell
        System.out.println(s1);
        s1.soldFlat();
        System.out.println(s1);

        // sell in build
        System.out.println(g1);
        ourBuild1.sell(102);
        System.out.println(g1);

    }
}



package Exercices_OOP._7_Abstract.t6_ToyStore;

public abstract class Toy {
    protected String name;
    protected double basePrice;
    private static int toyCount=0;

    public Toy(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        toyCount++;
    }

    public abstract double computePrice();
    public void changeBasePrice(double percent){
        this.basePrice = basePrice * (1 + percent/100);
    }
    public static int getToyCount(){
        return toyCount;
    }
    @Override
    public String toString() {
        return this.name+": the price is "+ this.computePrice();
    }
}

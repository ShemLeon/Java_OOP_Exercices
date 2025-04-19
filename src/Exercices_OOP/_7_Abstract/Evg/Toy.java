package Exercices_OOP._7_Abstract.Evg;
public abstract class Toy {
    private String name;
    protected double basePrice;
    private static int toyCount;

    public Toy(String name, double basePrice){
        this.name=name;
        this.basePrice=basePrice;
        toyCount++;
    }
    public abstract double computePrice();

    public void changeBasePrice(double percent){
        basePrice = basePrice + (basePrice * (percent / 100));
    }

    public String toString(){
        return this.name+": the price is ";
    }

    public static int getToyCount(){
        return toyCount;
    }
}

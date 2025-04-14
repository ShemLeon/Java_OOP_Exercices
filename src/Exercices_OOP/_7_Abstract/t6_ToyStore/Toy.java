package Exercices_OOP._7_Abstract.t6_ToyStore;
import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class Toy {
    private String name;
    private double basePrice;
    static int toyCount=0;

    public Toy(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double computePrice();

    public void changeBaseprice(double percent){
        this.basePrice *= (1+percent);
    }

    @Override
    public String toString() {
        return name+": the price is "+ this.computePrice();
    }
}


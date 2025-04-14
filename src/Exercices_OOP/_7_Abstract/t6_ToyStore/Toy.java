package Exercices_OOP._7_Abstract.t6_ToyStore;
import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class Toy {
    private String name;
    private double basePrice;
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
        return name+": the price is "+ this.computePrice();
    }
}

public abstract class ClassicToy extends Toy{
    public ClassicToy(String name, double basePrice, int fillAmount){

            super(name, basePrice);
        }
    public abstract int fillAmount();

        @Override
        public double computePrice(){
            double price;

            return price;
        }
}


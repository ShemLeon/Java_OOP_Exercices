package Exercices_OOP._7_Abstract.t6_ToyStore;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

import javax.xml.namespace.QName;

public class TeddyBear extends ClassicToy {
    private boolean isBig;
    private String color;
    private static final int MAX_FILL_BIG = 80;
    private static final int MAX_FILL_LITTLE = 50;
    public TeddyBear(String name, double basePrice, boolean isBig, String color){
        super(name, basePrice);
        this.name = name;
        this.basePrice = basePrice;
        this.isBig = isBig;
        this.color = color;

    }

    @Override
    public double computePrice(){
        return basePrice + ((isBig) ? 30 : 15);
    }
    @Override
    public String toString(){
        return name+ ": the price is "+computePrice()+", color:"+this.color+", is big: "+this.isBig;
    }
    @Override
    public void fill(int amountToFill){
        int newAmount = getFillAmount() + amountToFill;
        if (isBig) {
            if (newAmount <= MAX_FILL_BIG){
                setFillAmount(newAmount);
            } else {
                setFillAmount(MAX_FILL_BIG);
            }
        }
        if (!isBig) {
            if (newAmount <= MAX_FILL_LITTLE){
                setFillAmount(newAmount);
            } else {
                setFillAmount(MAX_FILL_LITTLE);
            }
        }
    }
    public static void main(String args[]){
        TeddyBear Teddy1 = new TeddyBear("Teddy1", 5.0, true, "red");
        System.out.println(Teddy1);
    }

}

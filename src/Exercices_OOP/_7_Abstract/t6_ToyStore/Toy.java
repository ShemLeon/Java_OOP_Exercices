package Exercices_OOP._7_Abstract.t6_ToyStore;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class Toy {
    protected String name;
    protected double basePrice;
    private static int toyCount=0;

    /**
     * Constructor for Toy
     * @param name the name of the toy
     * @param basePrice the base price
     */
    public Toy(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        toyCount++;
    }

    /**
     * Abstract method to calculate the price of the toy
     * @return the price of the toy
     */
    public abstract double computePrice();

    /**
     * Changes the base price by a given percent
     * @param percent the percent to change
     */
    public void changeBasePrice(double percent){
        this.basePrice = basePrice * (1 + percent/100);
    }

    /**
     * Gets the number of toys created
     * @return the number of toys
     */
    public static int getToyCount(){
        return toyCount;
    }

    /**
     * Returns a string representation of the toy
     * @return description of the toy
     */
    @Override
    public String toString() {
        return this.name+": the price is "+ this.computePrice();
    }
}

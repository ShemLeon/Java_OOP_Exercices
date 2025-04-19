package Exercices_OOP._7_Abstract.t6_ToyStore;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5


public class TeddyBear extends ClassicToy {
    private boolean isBig;
    private String color;
    private static final int MAX_FILL_BIG = 80;
    private static final int MAX_FILL_LITTLE = 50;
    /**
     * Constructor for TeddyBear
     * @param name the name of the toy
     * @param basePrice the base price
     * @param color the color of the teddy bear
     * @param isBig true if the bear is big, false if small
     */
    public TeddyBear(String name, double basePrice,  String color, boolean isBig){
        super(name, basePrice);
        this.name = name;
        this.basePrice = basePrice;
        this.isBig = isBig;
        this.color = color;
    }

    /**
     * Calculates the final price of the teddy bear
     * @return the price of the toy
     */
    @Override
    public double computePrice(){
        return basePrice + ((isBig) ? 30 : 15);
    }
    /**
     * Returns a string representation of the teddy bear
     * @return description of the teddy bear
     */
    @Override
    public String toString(){
        return name+ ": the price is "+computePrice()+", color:"+this.color+", is big: "+this.isBig;
    }
    /**
     * Fills the teddy bear with stuffing
     * @param amountToFill how much stuffing to add
     */
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
}

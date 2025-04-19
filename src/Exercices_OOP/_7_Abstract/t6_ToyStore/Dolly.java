package Exercices_OOP._7_Abstract.t6_ToyStore;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5


public class Dolly extends ClassicToy{
    private int accessories;
    private double accPrice;
    private static final int MAX_FILL = 60;

    /**
     * Constructor for Dolly
     * @param name the name of the doll
     * @param basePrice the base price
     * @param accessories the number of accessories
     * @param accPrice the price per accessory
     */
    public Dolly(String name, double basePrice, int accessories, double accPrice){
        super(name, basePrice);
        this.accessories = accessories;
        this.accPrice = accPrice;
    }

    /**
     * Calculates the final price of the doll
     * @return the price of the toy
     */
    @Override
    public double computePrice(){
        return basePrice + (accessories * accPrice);
    }

    /**
     * Fills the doll with stuffing
     * @param amountToFill how much stuffing to add
     */
    @Override
    public void fill(int amountToFill){
        int newAmount = getFillAmount() + amountToFill;
        if (newAmount <= MAX_FILL){
            setFillAmount(newAmount);
        } else {
            setFillAmount(MAX_FILL);
        }
    }

}
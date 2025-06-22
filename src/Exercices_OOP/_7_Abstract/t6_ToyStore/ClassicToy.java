package Exercices_OOP._7_Abstract.t6_ToyStore;

public abstract class ClassicToy extends Toy{
    private int fillAmount;
    /**
     * Constructor for ClassicToy
     * @param name the name of the toy
     * @param basePrice the base price
     */
    public ClassicToy(String name, double basePrice){
        super(name, basePrice);
        this.fillAmount = 0;
    }
    /**
     * Abstract method to fill the toy with stuffing
     * @param amountToFill how much stuffing to add
     */
    public abstract void fill(int amountToFill);
    /**
     * Gets the current fill amount
     * @return the amount of stuffing in the toy
     */
    protected int getFillAmount(){
        return this.fillAmount;
    }
    /**
     * Sets the current fill amount
     * @param fillAmount the amount of stuffing to set
     */
    protected void setFillAmount(int fillAmount){
        this.fillAmount = fillAmount;
    }
}

package Exercices_OOP._7_Abstract.t6_ToyStore;

public class Dolly extends ClassicToy{
    private int accessories;
    private double accPrice;
    private static final int MAX_FILL = 60;

    public Dolly(String name, double basePrice, int accessories, double accPrice){
        super(name, basePrice);
        this.accessories = accessories;
        this.accPrice = accPrice;
    }

    @Override
    public double computePrice(){
        return basePrice + (accessories * accPrice);
    }

    @Override
    public void fill(int amountToFill){
        int newAmount = getFillAmount() + amountToFill;
        if (newAmount <= MAX_FILL){
            setFillAmount(newAmount);
        } else {
            setFillAmount(MAX_FILL);        }    }}
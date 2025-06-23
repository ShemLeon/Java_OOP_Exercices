package Exercices_OOP._7_Abstract.t6_ToyStore;

public abstract class ClassicToy extends Toy{
    private int fillAmount;
    public ClassicToy(String name, double basePrice){
        super(name, basePrice);
        this.fillAmount = 0;
    }
    public abstract void fill(int amountToFill);
    protected int getFillAmount(){
        return this.fillAmount;
    }
     protected void setFillAmount(int fillAmount){
        this.fillAmount = fillAmount;
    }
}

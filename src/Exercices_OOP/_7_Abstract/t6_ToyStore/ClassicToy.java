package Exercices_OOP._7_Abstract.t6_ToyStore;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

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

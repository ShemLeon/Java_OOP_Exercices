package Exercices_OOP._7_Abstract.Evg;
public class Dolly extends ClassicToy {
    private int accessories;
    private double accPrice;

    public Dolly(String name, double basePrice, int accessories, double accPrice) {
        super(name, basePrice);
        this.accessories = accessories;
        this.accPrice = accPrice;
    }

    public double computePrice() {
        return (this.accessories * this.accPrice) + super.basePrice;
    }

    public void fill(int amountToFill){
        super.fillAmount=(Math.min(60,Math.max(0,amountToFill)));
    }

    public String toString(){
        return super.toString()+"the price is "+computePrice();
    }
}

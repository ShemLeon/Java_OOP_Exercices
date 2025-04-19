package Exercices_OOP._7_Abstract.Evg;
public class TeddyBear extends ClassicToy{
    private boolean isBig;
    private String color;
    public TeddyBear(String name, double basePrice,String color, boolean isBig){
        super(name,basePrice);
        this.color=color;
        this.isBig=isBig;
    }
    public double computePrice(){
        if(this.isBig)
            return super.basePrice+30;
        return super.basePrice+15;
    }

    public void fill(int amountToFill){
        if(isBig)
            super.fillAmount=(Math.min(80,Math.max(0,amountToFill)));
        else
            super.fillAmount=(Math.min(50,Math.max(0,amountToFill)));
    }


    public String toString(){
        return super.toString()+"the price is "+computePrice()+", color: "+this.color+", is big: "+this.isBig;
    }
}

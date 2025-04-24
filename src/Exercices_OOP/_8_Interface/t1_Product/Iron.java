package Exercices_OOP._8_Interface.t1_Product;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Iron extends Electronic{
    protected boolean auto;

    public Iron(String mf, String model, int nItems, double price, boolean auto) {
        super(mf, model, nItems, price);
        this.auto = auto;
    }

    public Iron(String mf, String model, int nItems, double price) {
        super(mf, model, nItems, price);
        this.auto = true;
    }

    public Iron(int nItems,  double price, boolean auto) {
        super();
        this.nItems = nItems;
        this.price = price;
        this.auto = auto;
    }

    public Iron(){
        super();
        this.auto = false;
    }
    @Override
    public String toString(){
        return super.toString() + " Auto"+this.auto;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof Iron){
            if(super.equals(obj)){
                Iron ir = (Iron)obj;
                if ((this.nItems==ir.nItems)&&(this.price==ir.price))
                    ans = true;
            }
        }
        return ans;
    }

    public void printPrice()
    {
        System.out.println(" my Item is an Iron : " +
                super.toString()+ "price: "+this.price);
    }
    public boolean discount() {
        return ((this.nItems > 100) && (this.price > 20));
    }
}

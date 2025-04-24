package Exercices_OOP._8_Interface.t1_Product;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Iron extends Product implements PayAble {
    protected int nItems; // items count
    protected double price;
    protected boolean auto;

    public Iron(String mf, String model, int nItems, double price, boolean auto) {
        super(mf, model);
        this.nItems = nItems;
        this.price = price;
        this.auto = auto;
    }

    public Iron(String mf, String model, int nItems, double price) {
        super(mf, model);
        this.nItems = nItems;
        this.price = price;
        this.auto = true;
    }

    public Iron(int nItems,  double price, boolean auto) {
        super();
        this.nItems = nItems;
        this.price = price;
        this.auto = true;
    }

    public Iron(){
        super();
        this.nItems = 0;
        this.price = 0;
        this.auto = false;
    }
    public String toString(){
        return super.toString()+"num of Iteams: "+this.nItems+
                "price :"+this.price+ "Auto"+this.auto;
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
    public double stock(){
        return nItems * price;
    }


    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}

package Exercices_OOP._8_Interface.t1_Product;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class Electronic extends Product implements PayAble {
    protected int nItems; // number of items
    protected double price; // price per item

    public Electronic(String mf, String model, int nItems, double price) {
        super(mf, model);
        this.nItems = nItems;
        this.price = price;
    }

    public Electronic() {
        super();
        this.nItems = 0;
        this.price = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " num of Items: " + this.nItems + " price: " + this.price;
    }

    @Override
    public void printPrice() {
        System.out.println(" my Item is: " + this.getClass().getSimpleName() +
                " : " + super.toString() + " price: " + this.price);
    }

    @Override
    public double stock() {
        return nItems * price;
    }

    // The discount method must be abstract because implementation differs in subclasses
    @Override
    public abstract boolean discount();

    // Base implementation of equals for electronic products
    @Override
    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof Electronic) {
            if (super.equals(obj)) {
                Electronic e = (Electronic)obj;
                if ((this.nItems == e.nItems) && (this.price == e.price))
                    ans = true;
            }
        }
        return ans;
    }
}

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



    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}

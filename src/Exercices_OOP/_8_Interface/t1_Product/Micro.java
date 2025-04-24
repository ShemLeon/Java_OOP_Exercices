package Exercices_OOP._8_Interface.t1_Product;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5
public class Micro extends Electronic {
    protected double radLevel;

    public Micro(String mf, String model, int nItems, double price, double radLevel) {
        super(mf, model, nItems, price);
        this.radLevel = radLevel;
    }

    public Micro(String mf, String model, int nItems, double price) {
        super(mf, model, nItems, price);
        this.radLevel = 0.0;
    }

    public Micro(int nItems, double price, double radLevel) {
        super();
        this.nItems = nItems;
        this.price = price;
        this.radLevel = radLevel;
    }

    public Micro() {
        super();
        this.radLevel = 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + " Radiation Level: " + this.radLevel;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof Micro) {
            if (super.equals(obj)) {
                Micro micro = (Micro)obj;
                if (this.radLevel == micro.radLevel)
                    ans = true;
            }
        }
        return ans;
    }

    @Override
    public void printPrice() {
        System.out.println(" my Item is a Micro : " +
                super.toString() + " price: " + this.price);
    }

    @Override
    public boolean discount() {
        return false;
    }
}
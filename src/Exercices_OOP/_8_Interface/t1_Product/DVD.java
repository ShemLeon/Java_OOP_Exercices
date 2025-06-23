package Exercices_OOP._8_Interface.t1_Product;

public class DVD extends Electronic{
    protected String brod;

    public DVD(String mf, String model, int nItems, double price, String brod) {
        super(mf, model, nItems, price);
        this.brod = brod;
    }

    public DVD(String mf, String model, int nItems, double price) {
        super(mf, model, nItems, price);
        this.brod = "Standard";
    }

    public DVD(int nItems, double price, String brod) {
        super();
        this.nItems = nItems;
        this.price = price;
        this.brod = brod;
    }

    public DVD() {
        super();
        this.brod = "Standard";
    }

    @Override
    public String toString() {
        return super.toString() + " Broadcast: " + this.brod;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof DVD) {
            if (super.equals(obj)) {
                DVD dvd = (DVD)obj;
                if (this.brod.equals(dvd.brod))
                    ans = true;
            }
        }
        return ans;
    }

    @Override
    public void printPrice() {
        System.out.println(" my Item is a DVD : " +
                super.toString() + " price: " + this.price);
    }

    @Override
    public boolean discount() {
        return (this.nItems > 200);
    }
}
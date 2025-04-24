package Exercices_OOP._8_Interface.t1_Product;

public class TV extends Electronic {
   protected boolean is3D;

    public TV(String mf, String model, int nItems, double price, boolean is3D) {
        super(mf, model, nItems, price);
        this.is3D = is3D;
    }

    public TV(String mf, String model, int nItems, double price) {
        super(mf, model, nItems, price);
        this.is3D = false;
    }

    public TV() {
        super();
        this.is3D = false;
    }

    @Override
    public String toString(){
        return super.toString()+" is3D: "+this.is3D;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof TV) {
            if (super.equals(obj)) {
                TV tv = (TV)obj;
                if (this.is3D == tv.is3D)
                    ans = true;
            }
        }
        return ans;
    }


    @Override
    public void printPrice() {
        System.out.println(" my Item is a TV : " +
                super.toString() + " price: " + this.price);
    }

    @Override
    public boolean discount() {
        return ((this.nItems > 20) && (this.price > 1000));
    }

}

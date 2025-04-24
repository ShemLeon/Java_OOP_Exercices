package Exercices_OOP._8_Interface.t1_Product;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Product {
    protected String mf; // name made
    protected String model; // model
    private int prodNum; // id product
    public static int count = 0;

    public Product(String mf, String model) {
        this.mf = mf+"";
        this.model = model+"";
        count++;
        prodNum=count;
    }

    public Product( ) {
        this.mf = "LG";
        this.model = "220055";
        count++;
        prodNum=count;
    }
    public String toString(){
        return "Product Num: "+this.prodNum+this.mf+this.model;
    }
    public boolean equals(Object obj){
        boolean ans = false;
        if (obj instanceof Product){
            Product p1 = (Product) obj;
            if ( (this.mf.equals(p1.mf)) && (this.model.equals(p1.model)) )
                ans = true;
        }
        return ans;
    }


}

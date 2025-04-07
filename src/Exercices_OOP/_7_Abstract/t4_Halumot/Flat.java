package Exercices_OOP._7_Abstract.t4_Halumot;


public abstract class Flat{
    private int numFlat;
    private int numFloor;
    private int countRooms;
    private int price;
    protected boolean isSold;
    public Flat(int numFlat, int numFloor, int countRooms, int price, boolean isSold) {
        this.numFlat = numFlat;
        this.numFloor = numFloor;
        this.countRooms = countRooms;
        this.price = price;
        this.isSold = isSold;
    }

    public abstract void soldFlat();

    public abstract String toString();


    public int getPrice() {
        return price;
    }

    public boolean isSold() {
        return isSold;
    }

    public int getNumFlat() {
         return this.numFlat;
    }



}

class Simple extends Flat{
    private int discount;
    public Simple(int numFlat, int numFloor, int countRooms, int price, boolean isSold, int discount) {
        super(numFlat, numFloor, countRooms, price, isSold);
        if (discount < 0 || discount > 10) {
            throw new IllegalArgumentException("Discount must be between 0 and 10");
        }else{
            this.discount=discount;
        }
    }

    @Override
    public void soldFlat() {
        this.isSold = true;
    }

    @Override
    public String toString() {
        return "Simple Flat №" + getNumFlat() + ", price: " + getPrice() + ", discount: " + discount + "%";
    }

    public int getDiscount() {
        return discount;
    }
}

class Garden extends Flat{
    private int gardenArea;
    public Garden(int numFlat, int numFloor, int countRooms, int price,boolean isSold, int gardenArea ) {
        super(numFlat, numFloor, countRooms, price, isSold);
        this.gardenArea=gardenArea;
    }

    @Override
    public void soldFlat() {
        this.isSold = true;
    }

    @Override
    public String toString() {
        return "Garden flat №" + getNumFlat() + ", price: " + getPrice() + ", garden area: " + gardenArea + "м²";
    }
}

class Duplex extends Flat{
    private int countLevels;
    public Duplex(int numFlat, int numFloor, int countRooms, int price, boolean isSold, int countLevels) {
        super(numFlat, numFloor, countRooms, price, isSold);
        this.countLevels=countLevels;
    }

    @Override
    public void soldFlat() {
        this.isSold = true;
    }

    @Override
    public String toString() {
        return "Duplex №" + getNumFlat() + ", price: " + getPrice() + ", count levels: " + countLevels;
    }
}

package Exercices_OOP._7_Abstract.t4_Halumot;


public abstract class Apartment {
    private int num;
    private int numFloor;
    private int countRooms;
    private int price;
    protected boolean isAvailable;
    public Apartment(int num, int numFloor, int countRooms, int price, boolean isAvailable) {
        this.num = num;
        this.numFloor = numFloor;
        this.countRooms = countRooms;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public abstract void soldFlat();
   // public abstract String toString();
    public abstract int getFinalPrice();

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getNum() {
         return this.num;
    }

    public String toString(){
        return "Flat №" + getNum() + ", is Available: "+ (isAvailable ? "YES" : "NO ") + ", price + " + getPrice();
    }



}

class Simple extends Apartment {
    private int discount;
    public Simple(int numFlat, int numFloor, int countRooms, int price, boolean isAvailable, int discount) {
        super(numFlat, numFloor, countRooms, price, isAvailable);
        if (discount < 0 || discount > 10) {
            throw new IllegalArgumentException("Discount must be between 0 and 10");
        }else{
            this.discount=discount;
        }
    }

    @Override
    public void soldFlat() {
        this.isAvailable = false;
    }

    @Override
    public String toString() {
        return "Simple " + super.toString()+ ", discount: " + discount + "%";
    }

    @Override
    public int getFinalPrice() {
        return (getPrice() * (1-discount));
    }
    public int getDiscount() {
        return discount;
    }

}

class Garden extends Apartment {
    private int gardenArea;
    public Garden(int numFlat, int numFloor, int countRooms, int price,boolean isAvailable, int gardenArea ) {
        super(numFlat, numFloor, countRooms, price, isAvailable);
        this.gardenArea=gardenArea;
    }

    @Override
    public void soldFlat() {
        this.isAvailable = false;
    }

    public int getFinalPrice() {
        return getPrice();
    }

    @Override
    public String toString() {
       // return "Garden flat №" + getNumFlat() + ", price: " + getPrice() + ", garden area: " + gardenArea + "м²";
        return "Garden " + super.toString()+ ", garden area: " + gardenArea + "м²";
    }
}

class Duplex extends Apartment {
    private int countLevels;
    public Duplex(int numFlat, int numFloor, int countRooms, int price, boolean isAvailable, int countLevels) {
        super(numFlat, numFloor, countRooms, price, isAvailable);
        this.countLevels=countLevels;
    }

    @Override
    public void soldFlat() {
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Duplex №" + super.toString()+ ", count levels: " + countLevels;
    }
    public int getFinalPrice() {
        return getPrice();
    }
    public static void main(String[] args){
        Simple s13 = new Simple(1,1,3,3000,true,3);
        Garden g13 = new Garden(2,1,3,3000, true, 200);
        Duplex d1 = new Duplex(3,1,3,3000,true,2);

        System.out.println(s13.toString());
        System.out.println(g13.toString());
    }
}

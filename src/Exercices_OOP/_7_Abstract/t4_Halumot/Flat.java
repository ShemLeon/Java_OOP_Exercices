package Exercices_OOP._7_Abstract.t4_Halumot;



public class Flat{
    private int numFlat;
    private int numFloor;
    private int countRooms;
    private int price;
    private boolean flagFree;
    public Flat(int numFlat, int numFloor, int countRooms, int price, boolean flagFree) {
        this.numFlat = numFlat;
        this.numFloor = numFloor;
        this.countRooms = countRooms;
        this.price = price;
        this.flagFree = flagFree;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlagFree() {
        return flagFree;
    }

    public int getNumFlat() {
         return this.numFlat;
    }
}

class Simple extends Flat{
    private int discount;
    public Simple(int numFlat, int numFloor, int countRooms, int price, boolean flagFree, int discount) {
        super(numFlat, numFloor, countRooms, price, flagFree);
        if (discount < 0 || discount > 10) {
            throw new IllegalArgumentException("Скидка должна быть в диапазоне от 0 до 10");
        }else{
            this.discount=discount;
        }
    }
}

class Garden extends Flat{
    private int gardenArea;
    public Garden(int numFlat, int numFloor, int countRooms, int price,boolean flagFree, int gardenArea ) {
        super(numFlat, numFloor, countRooms, price, flagFree);
        this.gardenArea=gardenArea;
    }
}

class Duplex extends Flat{
    private int countLevels;
    public Duplex(int numFlat, int numFloor, int countRooms, int price, boolean flagFree, int countLevels) {
        super(numFlat, numFloor, countRooms, price, flagFree);
        this.countLevels=countLevels;
    }
}

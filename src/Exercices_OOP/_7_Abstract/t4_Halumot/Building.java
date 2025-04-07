package Exercices_OOP._7_Abstract.t4_Halumot;

public class Building {
    private int floors;
    private int countFlats;
    private Flat[] flats;

    public Building(int floors, int countFlats, Flat[] flats) {
        this.floors = floors;
        this.countFlats = countFlats;
        this.flats = flats;
    }

    public void addFlat(Flat flat, int index) {
        if (index >= 0 && index < countFlats) {
            flats[index] = flat;
        } else {
            throw new IllegalArgumentException("Неверный индекс квартиры");
        }
    }
    public void freeFlatsPrice(int minPrice, int maxPrice){
        // выведет свободные хаты в ценовом диапазоне
        for (Flat flat : flats){
            if (!flat.isSold() && flat.getPrice() >= minPrice && flat.getPrice() <= maxPrice) {
                System.out.println("Номер квартиры: " + flat.getNumFlat() + ", Цена: " + flat.getPrice());
            }
        }
    }

    public int avgSimpleWithoutDiscount(){
        int avg = 0, sum=0, count = 0;
        for (Flat flat : flats){
            if ( (flat instanceof Simple) && (((Simple) flat).getDiscount()==0) ) {
                count++;
                sum+=flat.getPrice();
            }
        }
        if (count==0) return -1;
        avg = sum/count;
        return avg;
    }

    public static void main(String[] args) {
        Simple s1 = new Simple(1,1,3,3000,true,3);
        Simple s2 = new Simple(1,1,3,3000,true,0);
        Simple s3 = new Simple(1,1,3,4000,true,0);
        Garden g1 = new Garden(2,1,3,3000, true, 200);
        Duplex d1 = new Duplex(3,1,3,3000,true,2);
        Duplex d2 = new Duplex(4,1,3,1000,false,2);

        Flat[] flatsBuilding1 = new Flat[]{s1, s2, s3, g1, d1, d2};
        Building ourBild1 = new Building(5,4, flatsBuilding1);
        System.out.println("Average price Simple Flats without discount: "+ourBild1.avgSimpleWithoutDiscount());
    }
}



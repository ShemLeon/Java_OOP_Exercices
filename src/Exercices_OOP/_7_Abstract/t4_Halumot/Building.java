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
            if (flat.isFlagFree() && flat.getPrice() >= minPrice && flat.getPrice() <= maxPrice) {
                System.out.println("Номер квартиры: " + flat.getNumFlat() + ", Цена: " + flat.getPrice());
            }
        }
    }

    public static void main(String[] args) {
        Simple s1 = new Simple(1,1,3,3000,true,3);
        Garden g1 = new Garden(2,1,3,3000, true, 200);
        Duplex d1 = new Duplex(3,1,3,3000,true,2);
        Duplex d2 = new Duplex(4,1,3,1000,false,2);

        Flat[] flatsBuilding1 = new Flat[]{s1, g1, d1};
        Building ourBild1 = new Building(5,3, flatsBuilding1);
    }
}



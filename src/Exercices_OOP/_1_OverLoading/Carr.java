package Exercices_OOP._1_OverLoading;// import unit4.collectionsLib.Node;

public class Carr {
    public String make;
    public int year;
}

class Main {
    public static void main(String[] args) {
        Carr carr1 = new Carr();
        carr1.make = "Toyota";
        carr1.year = 2020;
        System.out.println("Car Make: " + carr1.make + ", Year: " + carr1.year);
// Car Make: Toyota, Year: 2020 - код выполнится, джава скрыто дает конструктор по умолчанию
    }
}




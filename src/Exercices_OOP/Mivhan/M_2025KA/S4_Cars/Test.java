package Exercices_OOP.Mivhan.M_2025KA.S4_Cars;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Truck();
        Car c = new Truck ();

        //  Car c1 = new Vehicle ();    //     1. --
        //  Car c2 = v1;                //     2. --
            Car c3 = (Car) v2;
            Car c4 = (Car) v3;
//          Car c5 = (Car) v1;          //     5. --
//        6.
//        Motorcycle m = new Motorcycle();
//        Vehicle v6 = m;
//        Car c6 = (Car) s6;
          Vehicle v7 = (Car)(new Truck ());
//        Car c8 = (Vehicle)(new Truck ()); //  8. --
    }
}

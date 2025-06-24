package Exercices_OOP._8_Interface.t5_nums_ex10_5.targil2;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Inter1 i1;                  // 1. ++
    //  Inter2 i2 = new Inter2();   // 2. --
    //  Inter i2 = new A1();        // 3. --

        Inter1 i2 = new A2();       // 4. ++
        i2.print1();                // 5. +-

        A1 a = new A3();            // 6. ++
        a.print1();                 // 6. ++

        A3 b = new A3();            // 7. +-
        A1 c = b;                   // 7. +- upcasting
    //  c.print2();
        ((Inter2)c).print2();

      // B1 b = new A1();           // 8. --

        BigB bigB = new BigB();     // 8. +-
    //  bigB.all[0].print1();       // 9. --

    }
}

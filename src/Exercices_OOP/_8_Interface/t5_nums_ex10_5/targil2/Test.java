package Exercices_OOP._8_Interface.t5_nums_ex10_5.targil2;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Inter1 i1;
    //  Inter2 i2 = new Inter2();
    //  Inter i2 = new A1();
        Inter1 i2 = new A2();
        i2.print1();
        A1 a = new A3();
        a.print1();

        A3 b = new A3();
        A1 c = b;
    //  c.print2();

    //  B1 b = new A1();

        BigB bigB = new BigB();
    //  bigB.all[0].print1();

    }
}

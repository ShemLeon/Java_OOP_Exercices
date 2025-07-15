package Exercices_OOP.Mivhan.E2_2025.S3_AB;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        A a1 = new A();                 // a1(1)
        A a2 = new A(3);            // a2(3)
        A ab = new B();                 // ab("B",1)
        B b1 = new B("B", 1);   // b1("B", 1)
        B b2 = new B("B", 3);   // b2("B", 3)

        if (a1.equals(b1)) System.out.println(11); // A-Object 11
        if (b1.equals(a1)) System.out.println(12); // B-A
        if (a1.equals(ab)) System.out.println(13); // A-Object 13
        if (ab.equals(a1)) System.out.println(14); // B-Object
        if (b1.equals(ab)) System.out.println(15);
    }
}

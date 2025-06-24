package Exercices_OOP._8_Interface.t4_scheme_ex10_4;

interface ITwo {
    void methodTwo();
}

interface IOne {
    void methodOne();
}

interface IThree extends IOne {
    void methodThree();
}

class C1 implements IOne {
    @Override
    public void methodOne() {
        System.out.println("C1 implements IOne");
    }
}

class C2 implements ITwo {
    @Override
    public void methodTwo() {
        System.out.println("C2 implements ITwo");
    }
}

class C3 implements IThree {
    @Override
    public void methodThree() {
        System.out.println("C3 implements IThree");
    }
    @Override
    public void methodOne() {
        System.out.println("C3 implements IOne (through IThree)");
    }
}

class C4 extends C3 implements ITwo {
    @Override
    public void methodTwo() {
        System.out.println("C4 implements ITwo");
    }
    @Override
    public void methodThree() {
        super.methodThree();
        System.out.println("C4 extends C3");
    }
}

public class OneTwoThree {
    public static void main(String[] args) {
        // ITwo a = new ITwo();     1. --
        ITwo b = new C2();  //      2. ++
        C3 c = new C4();    //      3. ++
        // C2 d = new C4(); //      4. --
        // C4 e = new C3(); //      5. --
        // C4 f = (C4)(new C3());  //  6. -- `ClassCastException`

        IOne g1 = new C1();     //  7. ++
        C4 g2 = new C4();       //  7. +
        g1 = g2;                //  7. +

        IOne h1 = new C4();     // 8. +-
        ITwo h2 = new C2();     // 8. +-
        // h2=h1;                  // 8. --
    }
}

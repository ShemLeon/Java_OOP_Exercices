package Exercices_OOP.Mivhan.O_cast.S10_AA_AB;// import unit4.collectionsLib.Node;

public class BB extends AA {
    public BB(){
        System.out.println("BB constructor");
    }
    public void one(){
        System.out.println("one in BB");
    }
    public void two(){
        System.out.println("two in BB");
    }
    public void three(){
        super.two();
    }
}

package Exercices_OOP.Mivhan.E2_2025.B1_ABCDE;

public class A {
    protected int x;
    public A(){
        this.x = 9;
        System.out.println("A.x = "+this.x);
    }
    public A(int x){
        this.x = x;
        System.out.println("A.x = "+this.x);
    }
    public int getX(){ return this.x;}
    public int foo(){return this.x;}
}

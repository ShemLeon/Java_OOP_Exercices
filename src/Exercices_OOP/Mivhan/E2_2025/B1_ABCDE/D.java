package Exercices_OOP.Mivhan.E2_2025.B1_ABCDE;

public class D extends C {
    public D(){
        this.x++;
        System.out.println("D.x = " + this.x);
    }
    public D(int x){
        super(x);
        System.out.println("D.x = "+this.x);
    }
    public D(int x, int y){
        super();
        this.x = this.x + x + y;
        System.out.println("D.x = "+this.x);
    }

    public int foo(){return this.x-1;}
}

package Exercices_OOP.Mivhan.E2_2025.S3_AB;

public class A {
    private int val;
    public A(){
        this.val=1;
    }
    public A(int val){
        this.val = val;
    }
   public int getVal(){
        return this.val;
   }
   public boolean equals(Object other){
        System.out.println("A-Object");
        if (other instanceof A)
            return this.val == ((A)other).val;
        return false;
    }
}

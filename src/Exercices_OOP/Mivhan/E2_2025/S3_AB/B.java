package Exercices_OOP.Mivhan.E2_2025.S3_AB;

public class B extends A {
    private String st;
    public B() {
        this.st = "B";
    }
    public B(String st, int val){
        super(val);
        this.st=st;
    }
    public String getSt(){
        return this.st;
    }
    public boolean equals(Object other) {
        System.out.println("B-object");
        if (other instanceof B){
            return this.st.equals( ((B)other).st) && this.getVal() == (((B) other).getVal());
        }
        return false;
    }
    public boolean equals(A other){
        System.out.println("B-A");
        if (other instanceof B)
            return this.st.equals(((B)other).st) && this.getVal()==((B)other).getVal();
        return false;
    }
    public boolean equals(B other){
        System.out.println("B-B");
            return this.st.equals(other.st) && this.getVal()==other.getVal();
    }
}
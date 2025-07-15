package Exercices_OOP.Mivhan.E2_2025.S1;// import unit4.collectionsLib.Node;

public class S1_4_Stam {
    private int val;
    private static int count = 0;
    public S1_4_Stam() {
        count++;
        this.val=count;
    }
    public S1_4_Stam(boolean over){
        if (!over){
            count++;
            this.val = count;
        }else{
            this.val = -999;
        }    }
    public void display(){        System.out.println("val=" + val+", count ="+count);    }

    public static void main(String[] args) {
        // 1) val 3, count 5
        S1_4_Stam s1 = new S1_4_Stam();
        S1_4_Stam s2 = new S1_4_Stam();
        S1_4_Stam s3 = new S1_4_Stam();
        S1_4_Stam s4 = new S1_4_Stam();
        S1_4_Stam s5= new S1_4_Stam();
        s3.display();  // 3 5
        s2.display();  // 2 5
        // 2) val -999, count 5
        S1_4_Stam d5 = new S1_4_Stam(true);
        d5.display();
        // 3) val 5, count 5
        s5.display();


    }
}

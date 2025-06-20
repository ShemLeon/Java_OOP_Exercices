package Exercices_OOP._2_Murkavim.Table;// import unit4.collectionsLib.Node;

public class School {
    private int count;         // number of classes
    private Kita[] kitot;      // array of classes

    // b. constructor
    public School(int maxKitot) {
        this.kitot = new Kita[maxKitot];  // a. array initialization
        this.count = 0;                   // b. counter initialization
    }

    // c. get class by index
    public Kita getKita(int i) {
        return kitot[i];
    }

    // d. add class to the school
    public void addClass(Kita k) {
        if (count < kitot.length) {
            kitot[count] = k;
            count++;
        } else {
            throw new IllegalStateException("The school is full");
        }
    }

    // e. count all tables in the school
    public int getTotalTables() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += kitot[i].howMany();
        }
        return total;
    }

    // f. find a class for 42 students (minimum 21 tables required)
    public int findClassFor42() {
        for (int i = 0; i < count; i++) {
            if (kitot[i].howMany() >= 21) {  // 42/2 = 21 tables minimum
                return i;
            }
        }
        return -1;  // if no suitable class is found
    }
    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}

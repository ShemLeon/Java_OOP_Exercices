package Exercices_OOP._2_Murkavim.Table;

public class Kita {
    private int count;
    private Table[] t;
    public Kita(int count, Table[] t){
        if (count > 35 || count < 0) {
            throw new IllegalArgumentException("There can be no more than 35 tables in the class");
        }
        this.count = count;
        this.t = t;
    }
    public int howMany(){
        return count;
    }
    public boolean isOk(int n){
        return n<=35;
    }
    public void addTable(Table t){
        // Adds a new table to the array t
        // 1. Create a new array with one more element than the current one
        Table[] newT = new Table[count + 1];
        // 2. Copy all old tables
        for(int i = 0; i < count; i++) {
            newT[i] = this.t[i];
        }
        // 3. Add the new table
        newT[count] = t;
        // 4. Update the reference and counter
        this.t = newT;
        count++;
    }
}

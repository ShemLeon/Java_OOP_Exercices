package Exercices_OOP._2_Murkavim.Table;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        Table t1 = new Table(1, 'B');
        Table t2 = new Table(2, 'A');
        System.out.println(t1);

        Kita k1 = new Kita(0, new Table[0]);

        // Add tables using the addTable method
        k1.addTable(t1);
        k1.addTable(t2);
    }
}

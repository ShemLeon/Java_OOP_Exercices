package Exercices_OOP._2_Murkavim.Table;

public class Table {
    private int line;
    private char tur;
    public Table(int line, char tur){
        if (line < 1 || line > 7) {
            throw new IllegalArgumentException("The row must be from 1 to 7");
        }
        if (tur < 'A' || tur > 'E') {
            throw new IllegalArgumentException("The column must be from A to E");
        }
        this.line = line;
        this.tur = tur;
    }

    public int getLine() {
        return line;
    }

    public char getTur() {
        return tur;
    }

    @Override
    public String toString() {
        return "Table#: "+this.line + "   Tur: "+this.tur;
    }

    public static void main(String[] args) {
        Table t1 = new Table(1, 'B');
        Table t2 = new Table(2, 'A');
        System.out.println(t1);

    }
}

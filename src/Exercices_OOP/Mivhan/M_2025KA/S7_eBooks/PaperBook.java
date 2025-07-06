package Exercices_OOP.Mivhan.M_2025KA.S7_eBooks;// import unit4.collectionsLib.Node;

public class PaperBook extends Book implements IGiftable {
    private int year;
    private int pages;
    private double addition;
    public double getAdditionPrice() {
        return addition;
    }

    public String getGiftType() {
        return "PaperBook";
    }
}

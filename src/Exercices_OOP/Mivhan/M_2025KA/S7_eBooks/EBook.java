package Exercices_OOP.Mivhan.M_2025KA.S7_eBooks;// import unit4.collectionsLib.Node;



public class EBook extends Book implements IDownloadable {
    public void download() {}
    public int getSize() {return fileSize;}
    protected int fileSize;
}



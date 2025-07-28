package Exercices_OOP.Mivhan.O_cast.S7_eBooks;// import unit4.collectionsLib.Node;


public class EBook extends Book implements IDownloadable {
    public void download() {}
    public int getSize() {return fileSize;}
    protected int fileSize;
}



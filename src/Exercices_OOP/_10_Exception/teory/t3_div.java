package Exercices_OOP._10_Exception.teory;// import unit4.collectionsLib.Node;

public class t3_div {
    public static int div(int a, int b){
        try {
            a = a/b;
        }
        catch (Exception e){
            System.out.println("there is a problem!");
        }
        finally {
            System.out.println("print anyway");
            return a;
        }
    }

    public static void main(String[] args) {
        div(5,2); //print anyway
        System.out.println(div(8,2)); // print anyway 4
        System.out.println(div(2,0));  // there is a problem! print anyway 2
        }
}

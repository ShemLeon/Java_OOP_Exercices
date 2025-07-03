package Exercices_OOP._10_Exception.teory.t6_print5;// import unit4.collectionsLib.Node;

public class Example {
//    public void printOnlyIfItIs5(int number){
//            if (number != 5)
//                throw new Exception();  // ← ПРОБЛЕМА ЗДЕСЬ
//            System.out.println("It is 5!");
//        }
//    }
    public static void printOnly5(int number){
        if (number!=5)
            throw new RuntimeException();
        System.out.println("It is 5!");
    }
    // или
    public void print5(int number) throws Exception{
        if (number!=5)
            throw new Exception();
        System.out.println("It is 5!");
    }
    public static void main(String[] args) {
        printOnly5(5);
        printOnly5(50);
        System.out.println("Shalom!");
    }
}


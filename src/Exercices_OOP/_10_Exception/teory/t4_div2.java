package Exercices_OOP._10_Exception.teory;// import unit4.collectionsLib.Node;

public class t4_div2 {
    // Метод, который делит на 2. Выбрасывает исключение, если число нечётное
    public int divideBy2(int n) throws Exception{
        if ((n%2) != 0)
            throw new Exception("The number is odd");
        return n/2;
    }
    public static void main(String[] args) {
       try {
           int halfN;
           t4_div2 myObj = new t4_div2();
           for (int i=2; i<10; i++){
               halfN = myObj.divideBy2(i);
               System.out.println("halfN = " + halfN);
           }
       }
       catch (Exception e){
           System.out.println("Ошибка: " + e.getMessage());
       }

        t4_div2 myObj = new t4_div2();
        for (int i=2; i<10; i++){
            try {
                int halfN = myObj.divideBy2(i);
                System.out.println("halfN = " + halfN);
            }
            catch (Exception e){
                System.out.println("Ошибка для числа " + i + ": " + e.getMessage());
            }
        }

    }
}

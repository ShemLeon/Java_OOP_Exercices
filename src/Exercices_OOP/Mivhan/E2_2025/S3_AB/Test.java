package Exercices_OOP.Mivhan.E2_2025.S3_AB;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        A a1 = new A();                 // a1(1)
        A a2 = new A(3);            // a2(3)
        A ab = new B();                 // ab("B",1)
        B b1 = new B("B", 1);   // b1("B", 1)
        B b2 = new B("B", 3);   // b2("B", 3)

        System.out.println("Метод 11:");
        if (a1.equals(b1)) System.out.println(11); // A-Object 11

        System.out.println(" Метод 12:");
        if (b1.equals(a1)) System.out.println(12); // B-A

        System.out.println(" Метод 13:");
        if (a1.equals(ab)) System.out.println(13); // A-Object 13

        System.out.println(" Метод 14:");
        if (ab.equals(a1)) System.out.println(14); // B-object

        System.out.println(" Метод 15:");
        if (b1.equals(ab)) System.out.println(15); // B-A, 15

        System.out.println(" Метод 16:");
        if (ab.equals(b1)) System.out.println(16); // B-object, 16

        System.out.println(" Метод 17:");
        if (a1.equals(a2)) System.out.println(17);

        System.out.println(" Метод 18:");
        if (b1.equals(b2)) System.out.println(18);


    }

    // Напишите функцию matchCount которая получает массив типа Object[].
    // ф-я считает и возвращает сколько из объектов в массиве это экземпляры
    // класса “B” и сколько из них отвечают двум требованиям: val >2 и st!=”B”.
    public static int matchCount(Object[] arr){
        int count = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i=0; i<arr.length; i++){
            Object obj = arr[i];
            if (obj instanceof B){
                B b_instance = (B) obj;
                if (b_instance.getVal()>2
                    && ( !"B".equals(b_instance.getSt()))
                ) count++;
            }
        }
        return count;
    }

    // Если изменить matchCount и она будет получать массив типа A[].
    // по сравнению с предыдущей ф-ей - надо что-то менять кроме аргументво ф-ии? нет.
    public static int matchCountBfromA(A[] arr){
        int count = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i=0; i<arr.length; i++){
            Object obj = arr[i];
            if (obj instanceof B){
                B b_instance = (B) obj;
                if (b_instance.getVal()>2
                        && ( !"B".equals(b_instance.getSt()))
                ) count++;
            }
        }
        return count;
    }
}

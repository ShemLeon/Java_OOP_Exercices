package Exercices_OOP._9_Sorter.t0_sorter;
import static Exercices_OOP._9_Sorter.t0_sorter.Sorter.printArr;
import static Exercices_OOP._9_Sorter.t0_sorter.Sorter.sort;

public class Test {
    public static void main(String[] args) {
        int[] testArr = {6,1,4,3,7,5,0,2};
        printArr(testArr);
        System.out.println(" ");
        sort(testArr);
        printArr(testArr);
    }
}

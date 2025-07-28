package Exercices_OOP.Mivhan.O_cast.S10_AA_AB;// import unit4.collectionsLib.Node;

public class Test {
    public static void main(String[] args) {
        AA a = new AA();    // 1. AA constructor
        BB b = new BB();    // 2. AA constructor -> BB constructor
        AA ab = new BB();   // 3. AA constructor -> BB constructor
        a.one();            // 4. one in AA
        ab.one();           // 5. one in BB
        b.two();            // 6. two in BB
        a.two();            // 7. one in AA
        ab.two();           // 8. two in BB
        b.two();            // 9. two in BB
        ((BB)(ab)).three(); // 10. one in BB -> ут ЖЕСТКАЯ ПОДЬЕБКА
        b.three();          // 11. one in BB -> ут ЖЕСТКАЯ ПОДЬЕБКА
    }
    public static void countObjectTypes(Object[] arr) {
        int countBB = 0;    int countAA_NotBB = 0;    int countNotAA = 0;
        for (Object obj : arr) {
            if (obj instanceof BB) {            countBB++;        }
            if (obj instanceof AA && !(obj instanceof BB)) {            countAA_NotBB++;        }
            if (!(obj instanceof AA)) {            countNotAA++;        }
        }
        System.out.println(countBB + " "+ countAA_NotBB+" " + countNotAA);
    }

}

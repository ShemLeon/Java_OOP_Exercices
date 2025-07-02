package Exercices_OOP._9_Enum.teory;

public enum Enums {
    A, B, C;
    private Enums() {
        System.out.println(1);
    }
}

class Test2 {
    public static void main(String[] args) {
        Enum en = Enums.B; // 1 1 1
    }
}
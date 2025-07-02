package Exercices_OOP._9_Enum.teory;

public enum Directions {
    NORTH, SOUTH, WEST, EAST;
    private Directions(){
        System.out.println(1);
    }
}

class Test{
    public static void main(String[] args){
        // Directions d1 = new Directions(); // ошибка компиляции
    }
}

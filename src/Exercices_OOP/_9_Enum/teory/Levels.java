package Exercices_OOP._9_Enum.teory;

public enum Levels {
    TOP, MEDIUM(10), BOTTOM(20,30);
    int i, j;
    private Levels(){}
    private Levels(int i){
        this.i = i;
        this.j = j;
    }
    private Levels(int i, int j){
        this.i = i;
        this.j = j;
    }
    public static void main(String[] args){
        System.out.println(Levels.TOP.i);   // 0
        System.out.println(Levels.TOP.j);   // 0
        System.out.println(Levels.MEDIUM.i);// 10
        System.out.println(Levels.MEDIUM.j);// 0
        System.out.println(Levels.BOTTOM.i);// 20
        System.out.println(Levels.BOTTOM.j);// 30
    }
}

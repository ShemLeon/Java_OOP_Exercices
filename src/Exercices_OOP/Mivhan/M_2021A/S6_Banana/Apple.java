package Exercices_OOP.Mivhan.M_2021A.S6_Banana;

public class Apple {
    private int weight;
    public Apple(int w){
        weight=w;
    }

    public boolean equals(Apple other) {
        return ((other!=null) && weight==other.weight);
    }
}

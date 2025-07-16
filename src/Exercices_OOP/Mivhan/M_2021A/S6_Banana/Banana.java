package Exercices_OOP.Mivhan.M_2021A.S6_Banana;

public class Banana {
    private int weight;
    public Banana (int w) {
        weight = w;
    }
    public int getWeight () {
        return weight;
    }
    public boolean equals (Object other) {
        return ((other != null) &&
                (other instanceof Banana) &&
                (weight == ((Banana)other).weight));
    }
}

// - **Banana**: Переопределение (Override) ✓
//- **Apple**: Перегрузка (Overload) ✓
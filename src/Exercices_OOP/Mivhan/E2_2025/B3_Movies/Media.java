package Exercices_OOP.Mivhan.E2_2025.B3_Movies;

public class Media {
    protected String title;
    public Media(String t) {
        this.title = t;
    }
    public String getTitle() {
        return this.title;
    }
    public boolean matches(Media other) {
        System.out.println("class Media");
        return this == other;
    }
} 
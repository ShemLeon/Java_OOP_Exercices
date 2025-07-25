package Exercices_OOP.Mivhan.E2_2025.B3_Movies;

public class Movie extends Media implements Watchable {
    private int duration;
    public Movie(String t, int d) {
        super(t);
        this.duration = d;
    }
    public int getDuration() {
        return this.duration;
    }
    public boolean matches(Movie other) {
        System.out.println("class Movie");
        return (other != null && this.title.equals(other.title) &&
                this.duration == other.duration);
    }

    public boolean matches(Watchable other) {
        System.out.println("class Movie");
        return (other instanceof Movie) && matches((Movie)other);
    }
} 
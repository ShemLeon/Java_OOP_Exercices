package Exercices_OOP.Mivhan.E2_2025.B3_Movies;

public class Documentary extends Media implements Watchable {
    private String topic;
    public Documentary(String t, String topic) {
        super(t);
        this.topic = topic;
    }
    public boolean matches(Watchable other) {
        System.out.println("class Documentary");
        return (other instanceof Documentary) &&
                ((this.title.equals(((Documentary)other).title)) ||
                (this.topic.equals(((Documentary)other).topic)));
    }
} 
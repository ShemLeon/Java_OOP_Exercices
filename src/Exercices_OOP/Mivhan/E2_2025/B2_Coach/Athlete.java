package Exercices_OOP.Mivhan.E2_2025.B2_Coach;

public class Athlete extends Coach {
    private Coach personalCoach;

    public Athlete(int n, int sessions, Coach personalCoach) {
        super(n, sessions, "Athlete");
        this.personalCoach = personalCoach;
        this.sessions = Math.max(0, personalCoach.sessions);
    }

    @Override
    public String toString() {
        return "Athlete: " + num + ", sessions: " + sessions +
                ", Coach: " + personalCoach.num +
                ", sessions: " + personalCoach.sessions +
                ", specialty: " + personalCoach.specialty;
    }
}

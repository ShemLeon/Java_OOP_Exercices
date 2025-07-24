package Exercices_OOP.Mivhan.E2_2025.B2_Coach;

public class Coach {
    protected int num;
    protected int sessions;
    protected String specialty;

    public Coach(int num, int sessions, String specialty) {
        this.num = num;
        this.sessions = sessions;
        this.specialty = specialty;
    }

    public Coach(Coach other) {
        this.num = other.num;
        this.sessions = other.sessions;
        this.specialty = other.specialty;
    }

    public void reduceSessions(int s) {
        if (s > 0) {
            this.sessions = Math.max(0, this.sessions - s);
        }
    }

    public void setNum(int n) {
        this.num = n;
    }

    @Override
    public String toString() {
        return "Coach: " + this.num + ", sessions: " + this.sessions + ", specialty: " + this.specialty;
    }
}

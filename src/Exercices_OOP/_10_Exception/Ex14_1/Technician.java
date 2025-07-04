package Exercices_OOP._10_Exception.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Technician extends Employee {
    private final int numComputers;
    private static final double COMPUTER_BONUS = 250;
    private static final int COMPUTERS_FOR_BONUS = 10;
    private static final int VOTE_SCORE = 23;

    public Technician(String name, int yearsOfSeniority, int numComputers) {
        super(name, yearsOfSeniority, EmployeeType.TECHNICIAN);
        this.numComputers = numComputers;
    }
    public double calculateSalary() {
        return calculateBaseSalary() + ((numComputers / COMPUTERS_FOR_BONUS) * COMPUTER_BONUS);
    }
    public int getVoteScore() {
        return VOTE_SCORE;
    }
    public int getNumComputers() {
        return numComputers;
    }
}

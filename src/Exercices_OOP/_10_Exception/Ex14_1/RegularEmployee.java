package Exercices_OOP._10_Exception.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class RegularEmployee extends Employee {
    private static final int VOTE_SCORE = 10;
    public RegularEmployee(String name, int yearsOfSeniority) {
        super(name, yearsOfSeniority, EmployeeType.REGULAR);
    }
    public double calculateSalary() {
        return calculateBaseSalary();
    }
    public int getVoteScore() {
        return VOTE_SCORE;
    }
}

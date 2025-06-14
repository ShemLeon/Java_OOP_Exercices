package Exercices_OOP._8_Interface.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Technician extends Employee{
    private final int numComputers;
    private static final double COMPUTER_BONUS = 250;
    private static final int COMPUTERS_FOR_BONUS = 10;
    private static final int MIN_COMPUTERS_FOR_BONUS = 100;
    private static final int MIN_YEARS_FOR_BONUS = 5;
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


    public static void main(String[] args) {
        System.out.println("Shalom!");
        Technician t1 = new Technician("Tehnik#1", 4, 130);
        System.out.println(t1);
        System.out.println(t1.calculateSalary());
        
    }


}

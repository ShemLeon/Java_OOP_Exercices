package Exercices_OOP._8_Interface.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class RegularEmployee extends Employee{

    private static final int MIN_YEARS_FOR_BONUS = 5;
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


    public static void main(String[] args) {
        System.out.println("Shalom!");
        RegularEmployee r1 = new RegularEmployee("qwe", 1);
        System.out.println(r1);
        RegularEmployee r3  = new RegularEmployee("Parampam", 4);
        System.out.println(r3);
        System.out.println(r3.calculateSalary());
    }


}

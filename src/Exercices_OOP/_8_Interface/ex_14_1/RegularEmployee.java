package Exercices_OOP._8_Interface.ex_14_1;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class RegularEmployee extends Employee{
    private static final int MIN_YEARS_FOR_BONUS = 5;
    public RegularEmployee(String name, int yearsOfSeniority) {
        super(name, yearsOfSeniority, EmployeeType.REGULAR);
    }

    public double calculateSalary() {
        return calculateBaseSalary();
    }

    public int getVoteScore() {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("Shalom!");
        RegularEmployee r1 = new RegularEmployee("qwe", 1);
        System.out.println(r1);
    }


}

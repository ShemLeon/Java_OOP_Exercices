package Exercices_OOP._8_Interface.ex_14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Technician extends Employee{
    private int yearsAsUnionMember;

    public Technician(String name, int yearsOfSeniority, int yearsAsUnionMember) {
        super(name, yearsOfSeniority, EmployeeType.UNION);
        this.yearsAsUnionMember = yearsAsUnionMember;
    }

    public double calculateSalary() {
        return calculateBaseSalary();
    }

    public int getVoteScore() {
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("Shalom!");
        Technician u1 = new Technician("qwe", 4, 2);
        System.out.println(u1);
        System.out.println(u1.calculateBaseSalary());
        
    }


}

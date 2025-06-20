package Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class UnionMember extends Employee {
    private int yearsAsUnionMember;
    private static final int VOTE_SCORE = 24;
    public UnionMember(String name, int yearsOfSeniority, int yearsAsUnionMember) {
        super(name, yearsOfSeniority, EmployeeType.UNION);
        this.yearsAsUnionMember = yearsAsUnionMember;
    }
    public double calculateSalary() {
        return calculateBaseSalary();
    }
    public int getVoteScore() {
        return VOTE_SCORE;
    }
}

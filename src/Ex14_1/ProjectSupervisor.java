package Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class ProjectSupervisor extends Employee {
    private final Employee[] team;
    public static final int COUNT_WORKERS = 15;
    private static final int TECHNICIAN_BONUS = 100;
    private static final int UNION_MEMBER_BONUS = 50;
    private static final int VOTE_SCORE = 12;

    public ProjectSupervisor(String name, int yearsOfSeniority, Employee[] team) {
        super(name, yearsOfSeniority, EmployeeType.SUPERVISOR);
        if (team.length > COUNT_WORKERS) {
            throw new IllegalArgumentException("Team size cannot exceed " + COUNT_WORKERS);
        }
        this.team = team;
    }

    public double calculateSalary(){
        double salary = calculateBaseSalary();

        for (int i = 0; i < team.length; i++) {
            Employee employee = team[i];
            if (employee instanceof Technician){
                salary += TECHNICIAN_BONUS;
            } else if (employee instanceof UnionMember) {
                salary += UNION_MEMBER_BONUS;
            }
        }
        return salary;
    }

    public int getVoteScore() {
        return VOTE_SCORE;
    }
}

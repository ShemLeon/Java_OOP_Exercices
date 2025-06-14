package Exercices_OOP._8_Interface.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class ProjectSupervisor extends Employee{
    private final Employee[] team;
    public static final int COUNT_WORKERS = 15;
    private static final int TECHNICIAN_BONUS = 100;
    private static final int UNION_MEMBER_BONUS = 50;
    private static final int VOTE_SCORE = 12;

    public ProjectSupervisor(String name, int yearsOfSeniority, Employee[] team) {
        super(name, yearsOfSeniority, EmployeeType.SUPERVISOR);
        this.team=team;
    }


    public double calculateSalary(){
        double salary = calculateBaseSalary();

        for (Employee employee : team){
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


    public static void main(String[] args) {
        System.out.println("Shalom!");
        // Сначала создаем массив сотрудников
        Employee[] team = new Employee[COUNT_WORKERS];

        // Заполняем команду разными типами сотрудников
        team[0] = new Technician("Ivan ", 3, 10);
        team[1] = new UnionMember("Petrov", 5, 3);
        team[2] = new Technician("Ololoev", 2, 400);
        team[3] = new RegularEmployee("Parampam", 4);
        team[4] = new UnionMember("Kozlov", 6, 10);
        team[5] = new Technician("Bananna", 1, 100);
        team[6] = new RegularEmployee("Volkov", 3);
        team[7] = new UnionMember("Suzanna", 4, 10);
        team[8] = new Technician("Pavel", 2, 200);
        team[9] = new RegularEmployee("Bibika", 5);

        ProjectSupervisor s1 = new ProjectSupervisor("qwe", 2, team);
        System.out.println(s1);
        System.out.println(s1.calculateSalary());
    }


}

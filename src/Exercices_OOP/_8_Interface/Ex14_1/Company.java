package Exercices_OOP._8_Interface.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Company {
    private final Employee[] employees;
    private int currentEmployeeCount;
    public static final int EMPLOYEES_MAX = 100;

    public Company(){
        this.employees = new Employee[EMPLOYEES_MAX];
        this.currentEmployeeCount = 0;
    }

    public boolean addEmployee(Employee e){
        if (currentEmployeeCount < EMPLOYEES_MAX){
            employees[currentEmployeeCount++] = e;
            return true;
        }
        return false;
    }

    public double getTotalMonthlySalary(){
        double total = 0;
        for (int i = 0; i < currentEmployeeCount; i++) {
            total += employees[i].calculateSalary();
        }
        return total;
    }

    public boolean isCompanyRenameAccepted(Votable[] voters){
        int regularAndTechVotes = 0;
        int otherVotes = 0;
        for (Votable voter : voters) {
            if (voter instanceof RegularEmployee || voter instanceof Technician) {
                regularAndTechVotes += voter.getVoteScore();
            } else {
                otherVotes += voter.getVoteScore();
            }
        }
        return regularAndTechVotes > otherVotes;
    }

    public boolean isEligibleForBonus(Employee e) throws BonusNotEligibleException {
        if (e instanceof RegularEmployee) {
            if (e.yearsOfSeniority <= 5) {
                throw new BonusNotEligibleException("Regular employee needs more than 5 years of experience");
            }
            return true;
        } else if (e instanceof Technician) {
            Technician tech = (Technician) e;
            if (tech.yearsOfSeniority <= 5 || tech.getNumComputers() <= 100) {
                throw new BonusNotEligibleException("Technician needs more than 5 years and 100 computers");
            }
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

        RegularEmployee e1 = new RegularEmployee("Alice", 6);
        Technician t1 = new Technician("Bob", 7, 120);
        UnionMember u1 = new UnionMember("Charlie", 5, 3);
        Employee[] team = {e1, t1, u1};
        ProjectSupervisor ps1 = new ProjectSupervisor("Dina", 4, team);

        Company company = new Company();
        company.addEmployee(e1);
        company.addEmployee(t1);
        company.addEmployee(u1);
        company.addEmployee(ps1);

        System.out.println("-- Employees --");
        Employee[] emps = {e1, t1, u1, ps1};
        Employee e;
        for (int i = 0; i < emps.length; i++) {
            e = emps[i];
            System.out.println(e.toString());
            System.out.println("Vote score: " + e.getVoteScore());
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println();
        }
    }
}

/*
-- Employees --
Name: Alice, Type: Emp regular, Years: 6
Vote score: 10
Salary: 11000.0
Name: Bob, Type: Emp Tech, Years: 7
Vote score: 23
Salary: 14500.0
Name: Charlie, Type: Emp in Union, Years: 5
Vote score: 24
Salary: 10500.0
Name: Dina, Type: Emp Super, Years: 4
Vote score: 12
Salary: 10150.0
 */
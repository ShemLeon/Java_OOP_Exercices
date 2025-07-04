package Exercices_OOP._10_Exception.Ex14_1;

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
}

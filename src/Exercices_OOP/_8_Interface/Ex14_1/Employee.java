package Exercices_OOP._8_Interface.Ex14_1;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class Employee implements Votable, Salaried {
    protected String name;
    protected int yearsOfSeniority;
    protected EmployeeType type;
    protected static final double BASE_SALARY = 8000;
    protected static final double SENIORITY_BONUS = 500;

    public Employee(String name, int yearsOfSeniority, EmployeeType type) {
        this.name = name;
        this.yearsOfSeniority = yearsOfSeniority;
        this.type = type;
    }

    // Добавляем базовый метод для расчета зарплаты
    protected double calculateBaseSalary() {
        return BASE_SALARY + (yearsOfSeniority * SENIORITY_BONUS);
    }

    public abstract int getVoteScore();
    public abstract double calculateSalary();
    
    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type.getDescription() + ", Years: " + yearsOfSeniority;
    }



}

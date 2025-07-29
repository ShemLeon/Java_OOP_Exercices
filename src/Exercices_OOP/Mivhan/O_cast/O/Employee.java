package Exercices_OOP.Mivhan.O_cast.O;

public class Employee extends Person implements Workable {
    protected int empId;
    public Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }
    public int getEmployeeId() {
        return empId;
    }
    @Override
    public void work() {
        System.out.println(name + " is working.");
    }
}

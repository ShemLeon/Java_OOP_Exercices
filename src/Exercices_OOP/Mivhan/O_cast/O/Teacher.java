package Exercices_OOP.Mivhan.O_cast.O;

public class Teacher extends Employee implements Learnable {
    public String subject;
    public Teacher(String name, int empId, String subject) {
        super(name, empId);
        this.subject = subject;
    }
    @Override
    public void study() {
        System.out.println(name + " is preparing for a lesson.");
    }
}

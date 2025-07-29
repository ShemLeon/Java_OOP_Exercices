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

    /**
     * Это правильное ПЕРЕОПРЕДЕЛЕНИЕ (Overriding) метода equals.
     * Аннотация @Override это подтверждает.
     * Метод принимает Object и будет вызываться полиморфно.
     */
    @Override
    public boolean equals(Object other) {
        System.out.println("--> Вызван Teacher.equals(Object other)");
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof Teacher)) return false;
        Teacher t = (Teacher) other;
        return this.getEmployeeId() == t.getEmployeeId() && this.subject.equals(t.subject);
    }


}

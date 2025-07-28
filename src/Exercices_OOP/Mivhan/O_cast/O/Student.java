package Exercices_OOP.Mivhan.O_cast.O;

public class Student extends Person implements Learnable {
    protected int studId;
    public Student(String name, int studId) {
        super(name);
        this.studId = studId;
    }
    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }
}
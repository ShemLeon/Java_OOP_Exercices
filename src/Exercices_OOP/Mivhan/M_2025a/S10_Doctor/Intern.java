package Exercices_OOP.Mivhan.M_2025a.S10_Doctor;// import unit4.collectionsLib.Node;

public class Intern extends Doctor {
    private Doctor mentor;
    public Intern(String name, String spec, Doctor mentor){
        super(name, spec);
        this.mentor = mentor;
        this.numOfPatients = mentor.numOfPatients/2;
    }
    public Doctor getMentor(){
        return mentor;
    }

    public String toString() {
        return "Intern: " + name + ", " + specialization +
                ", Mentor: " + mentor.name +", " +
                mentor.numOfPatients +"," + numOfPatients;

    }

}

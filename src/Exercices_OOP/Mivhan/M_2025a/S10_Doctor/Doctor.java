package Exercices_OOP.Mivhan.M_2025a.S10_Doctor;// import unit4.collectionsLib.Node;

public class Doctor {
    protected String name;
    protected String specialization;
    protected int numOfPatients;

    public Doctor(String name, String spec) {
        this.name = name;
        this.specialization = spec;
        this.numOfPatients = 0;
    }

    public Doctor(String name, String spec, int num) {
        this.name = name;
        this.specialization = spec;
        this.numOfPatients = num;
    }

    public Doctor(Doctor other) {
        this.name = other.name;
        this.specialization = other.specialization;
        this.numOfPatients = other.numOfPatients;
    }

    public void addPatients(int num){
        if (numOfPatients+num >=0)
            this.numOfPatients+=num;
    }

    @Override
    public String toString() {
        return "Doctor:" +name+ ", "+ specialization+ ", "+ numOfPatients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

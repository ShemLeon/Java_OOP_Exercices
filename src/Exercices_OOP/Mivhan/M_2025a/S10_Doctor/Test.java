package Exercices_OOP.Mivhan.M_2025a.S10_Doctor;// import unit4.collectionsLib.Node;

public class Test {
    public static void printNotSameSpec(Doctor[] d){
        for (int i = 0; i<d.length; i++){
            if ( d[i] instanceof Intern){
                Intern intern;
                intern = ((Intern) d[i]);
                if (d[i].getSpecialization().compareTo(intern.getMentor().getSpecialization()) !=0)
                    System.out.println(d[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        Doctor[] d = new Doctor[9];
        d[0] = new Doctor("Dr. Cohen", "Cardiology",12);
        d[1] = new Doctor("Dr. Levy", "Neurology");
        d[2] = new Doctor("Dr. Sharon", "Pediatrics",8);
        d[3] = new Intern("Dani", "Cardiology", new Doctor(d[0]));
        d[4] = new Intern("Yael", "Surgery", d[0]);
        d[5] = new Intern("Avi", "Pediatrics", new Doctor(d[2]));
        d[6] = new Intern("Ruth", "Oncology", d[2]);
        d[7] = new Intern("Noam", "Cardiology", new Doctor(d[1]));
        d[8] = new Intern("Maya", "Neurology", new Doctor(d[0]));

        for (int i=0; i<d.length; i++) {
            System.out.println(i+" _ "+d [i]);
        }

        d[0] = new Doctor("Dr. Goldman","Neurology",20);
        d[2].setName("Dr. Galper");

        d[2].addPatients(100);
        d[3].addPatients(200);
        d[5].addPatients(100);

        System.out.println("After change:");
        for (int i=0; i<d.length; i++) {
            System.out.println(i+" _ "+d[i]);
        }
        printNotSameSpec(d);
    }
}

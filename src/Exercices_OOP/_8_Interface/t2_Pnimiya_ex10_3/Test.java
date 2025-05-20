package Exercices_OOP._8_Interface.t2_Pnimiya_ex10_3;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Test {
    public static void main(String[] args) {

        Teacher teacherA = new Teacher("Ivanov");
        Teacher teacherB = new Teacher("Petrov");


        AStudent studentA = new AStudent(55, "GroupA");
        BStudent studentB = new BStudent(56, "GroupB");

        studentA.setGroupTeacher(teacherA);
        studentA.setGroupGrade(160);
        studentB.setGroupTeacher(teacherB);
        studentB.setGroupGrade(170);

        Student[] students = {
                new AStudent(1,"Anna"),
                new AStudent(2,"Boris"),
                new BStudent(3,"Vera"),
                new BStudent(4,"Dima")
        };

        int count = 0;
        for (Student s : students) {
            if (s.hasPermission()) count++;
        }
        System.out.println("Number of students allowed to leave: " + count);
    }
}

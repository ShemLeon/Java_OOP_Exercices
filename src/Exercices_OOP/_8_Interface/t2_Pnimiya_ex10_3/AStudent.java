package Exercices_OOP._8_Interface.t2_Pnimiya_ex10_3;

public class AStudent implements Student {
    private int id;
    private String name;
    private static int grade;
    private static Teacher groupTeacher;

    public AStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setGroupGrade(int grade) {
        AStudent.grade = grade;
    }

    public int getGroupGrade() {
        return AStudent.grade;
    }

    public Teacher getGroupTeacher()
    {
        return AStudent.groupTeacher;
    }

    public void setGroupTeacher(Teacher newTeacher) {
        AStudent.groupTeacher = newTeacher;
    }

    public boolean hasPermission() {
        return (AStudent.grade > 150) && (AStudent.groupTeacher != null && AStudent.groupTeacher.givePermission(this));
    }
}
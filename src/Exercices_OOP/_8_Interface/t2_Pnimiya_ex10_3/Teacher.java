package Exercices_OOP._8_Interface.t2_Pnimiya_ex10_3;

public class Teacher {
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    public boolean givePermission(Student student) {
        return student.getGroupGrade() > 0; // Базовое условие - студент должен иметь положительную оценку
    }
}

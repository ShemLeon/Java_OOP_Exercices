package Exercices_OOP._8_Interface.t2_Pnimiya;

public class BStudent implements Student  {
    private int id;
    private String name;
    private static int grade;
    private static Teacher groupTeacher;

    public BStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Статический метод для установки групповой оценки
    public void setGroupGrade(int grade) {
        BStudent.grade = grade;
    }

    // Реализация интерфейса (нестатический, возвращает статическое поле)
    public int getGroupGrade() {
        return BStudent.grade;
    }

    // Реализация интерфейса (нестатический, возвращает статическое поле)
    public Teacher getGroupTeacher() {
        return BStudent.groupTeacher;
    }

    // Статический метод для установки учителя группы
    public void setGroupTeacher(Teacher newTeacher) {
        BStudent.groupTeacher = newTeacher;
    }

    // Реализация интерфейса
    public boolean hasPermission() {
        return (BStudent.grade > 200) && (BStudent.groupTeacher != null && BStudent.groupTeacher.givePermission(this));
    }
}
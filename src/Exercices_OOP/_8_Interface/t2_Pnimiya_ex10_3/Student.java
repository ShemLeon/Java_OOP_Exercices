package Exercices_OOP._8_Interface.t2_Pnimiya_ex10_3;

public interface Student
{
    /* שיטה המעדכנת את הציון השכבתי על פי הפרמטר */
    public void setGroupGrade (int grade);
    /* שיטה המחזירה את הציון השכבתי */
    public int getGroupGrade();
    /* שיטה המחזירה את רכז השכבה */
    public Teacher getGroupTeacher();
    /* שיטה המחליפה את רכז השכבה */
    public void setGroupTeacher (Teacher newTeacher);
    /* שיטה המודיעה האם התקבל אישור יציאה מהפנימייה */
    public boolean hasPermission();
}
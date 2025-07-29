package Exercices_OOP.Mivhan.O_cast.O;

public class Student extends Person implements Learnable {
    protected int studId;
    public Student(String name, int studId) {
        super(name);
        this.studId = studId;
    }

    public int getStudId() {
        return studId;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }

    /**
     * ВНИМАНИЕ: Это ПЕРЕГРУЗКА (Overloading), а НЕ ПЕРЕОПРЕДЕЛЕНИЕ (Overriding)!
     * Метод НЕ будет вызываться полиморфно для ссылок типа Person или Object.
     * Он будет работать только при явном вызове у объекта Student с аргументом Student.
     */
    public boolean equals(Student other) {
        System.out.println("--> Вызван Student.equals(Student other)");
        if (other == null) return false;
        return this.studId == other.studId;
    }

    public int getId() {
        return studId;
    }
}
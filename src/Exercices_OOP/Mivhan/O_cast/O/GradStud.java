package Exercices_OOP.Mivhan.O_cast.O;

public class GradStud extends Student implements Workable {
    public String topic;
    public GradStud(String name, int studId, String topic) {
        super(name, studId);
        this.topic = topic;
    }
    @Override
    public void work() {
        System.out.println(name + " is working on their topic.");
    }
    /**
     * ПРАВИЛЬНОЕ ПЕРЕОПРЕДЕЛЕНИЕ (Overriding) метода equals.
     */
    @Override
    public boolean equals(Object other) {
        System.out.println("--> Вызван GradStud.equals(Object other)");
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof GradStud)) return false;
        GradStud gs = (GradStud) other;
        // Сравниваем поля и своего класса, и родительского
        return this.getId() == gs.getId() && this.topic.equals(gs.topic);
    }
}

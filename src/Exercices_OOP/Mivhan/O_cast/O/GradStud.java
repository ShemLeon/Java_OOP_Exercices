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
}

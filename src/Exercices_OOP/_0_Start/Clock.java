package Exercices_OOP._0_Start;

public class Clock {
    private int hour;
    private int minutes;
    
    public Clock(int hour, int minutes){
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean assertHour(Clock c1, Clock c2){
        return c1.getHour() == c2.getHour();
    }

    public int pereshMinutes(Clock c1, Clock c2){
        return Math.abs(c1.getHour()*60 + c1.getMinutes() - c2.getHour()*60 - c2.getMinutes());
    }

    public String toString(){
        return "<" + hour + ":" + minutes + ">";
    }

    public static void main(String[] args) {
        Clock c1 = new Clock(12, 30);
        Clock c2 = new Clock(12, 45);
        Clock c3 = new Clock(14, 20);


        System.out.println(c1.toString()+ " & "+c2.toString()+" have the same Hour: "+c1.assertHour(c1, c2));
        System.out.println(c1.toString()+ " & "+c3.toString()+" have the same Hour: "+c1.assertHour(c1, c3));
        System.out.println(c1.toString()+ " & "+c2.toString()+" have difference in minutes: " + c1.pereshMinutes(c1, c2));
    }
}

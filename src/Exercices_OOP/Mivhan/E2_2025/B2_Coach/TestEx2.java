package Exercices_OOP.Mivhan.E2_2025.B2_Coach;

public class TestEx2 {
    public static void main(String[] args) {
        Coach[] c = new Coach[4];

        c[0] = new Coach(123, 12, "Jym");
        c[1] = new Coach(234, 8, "CrossFit");

        c[2] = new Athlete(345, 6, new Coach(c[0]));
        c[3] = new Athlete(456, 10, c[1]);

        System.out.println("\nOld Team:");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        c[0] = new Coach(567, 8, "Studio");
        c[1].setNum(678);
        c[2].reduceSessions(3);
        c[3].reduceSessions(11);

        System.out.println("\nNew Team:");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}

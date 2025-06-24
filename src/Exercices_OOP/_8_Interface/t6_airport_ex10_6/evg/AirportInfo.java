package Exercices_OOP._8_Interface.t6_airport_ex10_6.evg;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class AirportInfo {
    public static void sortTransport(Comparable[] transport) {
        for (int i = 0; i < transport.length - 1; i++) {
            for (int j = i + 1; j < transport.length; j++) {
                if (transport[i].compareTo(transport[j]) > 0) {
                    Comparable temp = transport[i];
                    transport[i] = transport[j];
                    transport[j] = temp;
                }
            }
        }
    }

    public static String reportAll(Movable[] movable) {
        StringBuilder sb = new StringBuilder();
        for (Movable m : movable) {
            sb.append(m.details()).append("\n");
        }
        return sb.toString().trim();
    }
}

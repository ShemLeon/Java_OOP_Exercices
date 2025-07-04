package Exercices_OOP.Mivhan.M_2025a.S4_CarMoto;// import unit4.collectionsLib.Node;


// א. כתבו פעולה המקבלת מערך הפניות לעצמים מסוג Object. הפעולה תחזיר מספר אופנועים
//)עצמים מסוג Motorcycle )שמהירותם המרבית היא בין 180 ל250- קמ"ש.

public class Drive {
     public static int countCars(Object[] v){
        int count = 0;
        Motorcycle m;
        for (int i=0; i<v.length; i++){
            if (v[i] instanceof Motorcycle) {
                m = (Motorcycle) v[i];
                if (m.getSpeed() >= 180 && m.getSpeed() <= 250)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Car c1 = new Car (180);
        Object c2 = new Car (180);
        Motorcycle m1 = new Motorcycle (180);
        Object m2 = new Motorcycle (180);

        // Создаем массив с различными объектами
        Object[] vehicles = {
                c1, c2,m1, m2,
                new Motorcycle(200),      // попадет в диапазон
                new Motorcycle(220),      // попадет в диапазон
                new Motorcycle(260),      // не попадет в диапазон (> 250)
                new Motorcycle(180),      // не попадет (граница не включена - >180)
                new Motorcycle(181),      // попадет в диапазон
                new Motorcycle(249)       // попадет в диапазон
        };

        System.out.println("Count of Motorcycles 250>speed>180 = " +
                countCars(vehicles));

// 11)  System.out.println (c1.speed);
// 12)  System.out.println (((Motorcycle)c2).getSpeed());
        System.out.println (c1.equals(c2)); // 13) false
        System.out.println (c2.equals(c1)); // 14) false
        System.out.println (m1.equals(m2)); // 15) true
        System.out.println (m2.equals(m1)); // 16) true
        System.out.println (c1.equals((Motorcycle)m2));
        System.out.println (c1.equals((Car)c2));
        System.out.println (m1.equals((Car)c2));
// 20)  System.out.println (m1.equals((Motorcycle)c2));
    }
}

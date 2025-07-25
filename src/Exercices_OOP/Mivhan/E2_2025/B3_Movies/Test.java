package Exercices_OOP.Mivhan.E2_2025.B3_Movies;// package Exercices_OOP.Mivhan.E2_2025.B3_Movies;

import Exercices_OOP.Mivhan.E2_2025.B3_Movies.Documentary;
import Exercices_OOP.Mivhan.E2_2025.B3_Movies.Media;
import Exercices_OOP.Mivhan.E2_2025.B3_Movies.Movie;
import Exercices_OOP.Mivhan.E2_2025.B3_Movies.Watchable;

public class Test {
    public static void main(String[] args) {
        Movie m1 = new Movie("Frozen", 95);
        Object m2 = new Movie("Smurfs", 110);
        Documentary d1 = new Documentary("Our Planet", "Nature");
        Media d2 = new Documentary("Amazing life", "Nature");
        System.out.println("\n--- Analysis ---");

        // 1. Вывод: class Documentary, true
        System.out.println("Line 1:");
        System.out.println(((Watchable)d2).matches((Watchable)d1));

        // 2. Вывод: class Movie, false
        System.out.println("\nLine 2:");
        System.out.println(m1.matches((Movie)m2));

        // 3. ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: ClassCastException (Documentary cannot be cast to Movie)
        System.out.println("\nLine 3:");
        // System.out.println(((Movie)d2).getDuration());

        // 4. ОШИБКА КОМПИЛЯЦИИ: метод getTitle() не определен для типа Object
        System.out.println("\nLine 4:");
        // System.out.println(m2.getTitle());
        System.out.println(((Movie)m2).getTitle());

        // 5. ОШИБКА КОМПИЛЯЦИИ: есть несколько методов `matches`: `Movie`
        System.out.println("\nLine 5:");
     //   System.out.println(((Documentary)m2).matches(d1));

        // 6. Вывод: Frozen (поле protected, доступно в том же пакете)
        System.out.println("\nLine 6:");
        System.out.println(m1.title);

        // 7.  ОШИБКА КОМПИЛЯЦИИ
        System.out.println("\nLine 7:");
     // System.out.println(m1.matches(d1));
        System.out.println(m1.matches((Watchable) d1));

        // 8. Вывод: class Movie, class Movie, false
        System.out.println("\nLine 8:");
        System.out.println(m1.matches((Watchable)m2));

        // 9. ОШИБКА КОМПИЛЯЦИИ: нет метода matches(Object) в классе Movie
        System.out.println("\nLine 9:");
      //  System.out.println(m1.matches(m2));
        System.out.println(m1.matches((Movie)m2));

        // 10. Вывод: class Documentary, true
        System.out.println("\nLine 10:");
        System.out.println(d1.matches((Watchable)d2));

        // 11. Вывод: class Media, false
        System.out.println("\nLine 11:");
        System.out.println(d1.matches(d2));

        // 12. Ошибка - проверить какая. Вывод: class Documentary, false
        System.out.println("\nLine 12:");
      //  System.out.println(((Documentary)d2).matches(m1));

        // 13. Вывод: Frozen
        System.out.println("\nLine 13:");
        System.out.println(((Media)m1).getTitle());

        // 14. Вывод: class Media, true
        System.out.println("\nLine 14:");
        System.out.println(((Movie)m2).matches((Media)m2));

        // 15. ОШИБКА ВРЕМЕНИ ВЫПОЛНЕНИЯ: ClassCastException (Documentary cannot be cast to Movie)
        System.out.println("\nLine 15:");
        // System.out.println(m1.matches((Movie)d2));
    }
}

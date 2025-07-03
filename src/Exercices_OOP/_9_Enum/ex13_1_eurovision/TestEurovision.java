package Exercices_OOP._9_Enum.ex13_1_eurovision;// import unit4.collectionsLib.Node;
import java.util.Arrays;

public class TestEurovision {
    public static void main(String[] args) {
        Country[] countries = new Country[]{
                new JuryVoted("Sweden", 1, 340),
                new AudienceVoted("Finland", 2, 376),
                new JuryVoted("France", 3, 280),
                new AudienceVoted("Norway", 4, 210),
                new JuryVoted("Israel", 5, 250),
                new AudienceVoted("Italy", 6, 198)
        };

        //  Пример сортировки по голосам (low to high)
        Arrays.sort(countries, (c1, c2) ->
                Integer.compare(c1.getPoints(), c2.getPoints()));

        // Sort the countries by votes (high to low)
        Arrays.sort(countries, (c1, c2) ->
                Integer.compare(c2.getPoints(), c1.getPoints()));

        // Пример сортировки по алфавиту by name (A to Z)
        Arrays.sort(countries, (c1, c2) ->
                c1.getName().compareTo(c2.getName()));

        // Print the country details one by one
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i].toString());
        }
    }
}

package Exercices_OOP._7_Abstract.t5_trek;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class Trek {
    private final String name;
    private final String location;
    private final int duration;

    public Trek(String name, String location, int duration) {
        this.name = name;
        this.location = location;
        this.duration = duration;
    }

    // Возвращает уровень сложности тура
    public abstract String getDifficulty();

    // Возвращает список необходимого снаряжения
    public abstract Node<String> getRequiredEquipment();

    // Выводит детали тура
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Difficulty: " + getDifficulty());
        
        System.out.print("Required Equipment: ");
        Node<String> equipment = getRequiredEquipment();
        while (equipment != null) {
            System.out.print(equipment.getValue() + ", ");
            equipment = equipment.getNext();
        }
        System.out.println();
    }

    // Геттеры для доступа к приватным полям
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}

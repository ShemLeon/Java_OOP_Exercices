package Exercices_OOP._7_Abstract.t5_trek;
import unit4.collectionsLib.Node;

public class MountainTrek extends Trek {
    private int maxAltitude; // максимальная высота тура в метрах

    public MountainTrek(String name, String location, int duration, int maxAltitude) {
        super(name, location, duration);
        this.maxAltitude = maxAltitude;
    }

    /**
     * Возвращает уровень сложности горного тура - всегда "Hard"
     * @return строка "Hard"
     */
    @Override
    public String getDifficulty() {
        return "Hard";
    }

    /**
     * Возвращает список необходимого снаряжения для горного тура
     * @return список снаряжения в виде связного списка
     */
    @Override
    public Node<String> getRequiredEquipment() {
        // Создаем список снаряжения для горного тура
        return new Node<>("Warm coat", new Node<>("Walking sticks", new Node<>("Climbing shoes")));
    }

    /**
     * Получить максимальную высоту тура
     * @return максимальная высота в метрах
     */
    public int getMaxAltitude() {
        return maxAltitude;
    }

    /**
     * Установить максимальную высоту тура
     * @param maxAltitude новая максимальная высота в метрах
     */
    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }
}

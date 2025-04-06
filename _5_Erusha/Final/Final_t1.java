package Exercices_OOP._5_Erusha.Final;

/**
 * Класс для демонстрации использования ключевого слова final в Java
 */
public class Final_t1 {
    // final переменная - нельзя изменить после инициализации
    public static final String GREETING = "Привет, мир!";

    // final класс - нельзя наследовать
    public final static class DeadMachine {
        public void showInfo() {
            System.out.println("Я final класс DeadMachine, от меня нельзя наследоваться!");
        }
    }

    // Обычный класс с final методом
    public static class RegularCar {
        private String model;
        private int maxSpeed;

        public RegularCar(String model, int maxSpeed) {
            this.model = model;
            this.maxSpeed = maxSpeed;
        }

        public void showInfo() {
            System.out.println("Модель: " + model + ", максимальная скорость: " + maxSpeed);
        }

        // final метод - нельзя переопределить в подклассах
        public final void accelerate() {
            System.out.println("Автомобиль " + model + " разгоняется!");
        }
    }



    // Подкласс с попыткой переопределить final метод
    public static class SportsCar extends RegularCar {
        public SportsCar(String model, int maxSpeed) {
            super(model, maxSpeed);
        }

        // Этот метод можно переопределить, так как он не final
        @Override
        public void showInfo() {
            System.out.println("СПОРТКАР: " + super.model + ", супер быстрый!");
        }

        // Следующий метод вызовет ошибку компиляции, так как accelerate() в родительском классе объявлен как final
        /*
        @Override
        public void accelerate() {
            System.out.println("Спорткар разгоняется ОЧЕНЬ быстро!");
        }
        */
    }
    public static void main(String[] args) {
        System.out.println(GREETING); // Привет, мир!
        
        // Создаем экземпляры классов
        DeadMachine deadMachine = new DeadMachine();
        deadMachine.showInfo();  // Я final класс DeadMachine, от меня нельзя наследоваться!
        
        RegularCar car = new RegularCar("Тойота", 250);
        car.showInfo(); // Модель: Тойота, максимальная скорость: 250
        car.accelerate(); // Автомобиль Тойота разгоняется!
        
        SportsCar sportsCar = new SportsCar("Феррари", 350);
        sportsCar.showInfo(); // СПОРТКАР: Феррари, супер быстрый!
        sportsCar.accelerate();
        
        // Пример с final переменной внутри метода
        final int MAX_SPEED = 300;

        // MAX_SPEED = 400; // Это вызовет ошибку компиляции
        System.out.println("Максимальная скорость: " + MAX_SPEED);
    }
    

    

}

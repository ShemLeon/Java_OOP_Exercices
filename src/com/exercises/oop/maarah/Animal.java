package com.exercises.oop.maarah;

public class Animal {
    private String name; // Name of the animal
    private int age;     // Age of the animal
    private String type; // Type of the animal

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Тип: " + type);
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", type='" + type + "'}";
    }

    public static class Zoo {
        private Animal[] animals;
        private int count;

        public Zoo() {
            animals = new Animal[10];
            count = 0;
        }

        public void addAnimal(Animal animal) {
            if (count < animals.length) {
                animals[count++] = animal;
            }
        }

        public void removeAnimal(String name) {
            for (int i = 0; i < count; i++) {
                if (animals[i].getName().equals(name)) {
                    for (int j = i; j < count - 1; j++) {
                        animals[j] = animals[j + 1];
                    }
                    animals[--count] = null;
                    break;
                }
            }
        }

        public int getCount() {
            return count;
        }

        public void displayAnimals() {
            for (int i = 0; i < count; i++) {
                animals[i].display();
            }
        }
    }

    public static void main(String[] args) {
        Animal lion = new Animal("Лев", 5, "Хищник");
        Animal elephant = new Animal("Слон", 10, "Травоядное");
        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        System.out.println("Животные в зоопарке:");
        zoo.displayAnimals();
        System.out.println("Количество животных: " + zoo.getCount());
        
        zoo.removeAnimal("Лев");
        System.out.println("\nПосле удаления льва:");
        zoo.displayAnimals();
        System.out.println("Количество животных: " + zoo.getCount());
    }
} 
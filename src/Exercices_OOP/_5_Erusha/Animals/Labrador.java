package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;


public class Labrador extends Dog {
    private Object toy;


    public Labrador(String name, String gender, double milk, int bonesToEat,  Object favoriteToy
    ) {
        super(name, gender, milk, bonesToEat);
        this.toy = favoriteToy;
    }

    public void guide(Object newToy){
        System.out.println(this.name + " играет с " + newToy.toString());
    }
    @Override
    public String toString() {
        return super.toString() + ", любимая игрушка: " + toy.toString();
    }


    public static void main(String[] args) {
        // Создаем любимую игрушку
        Object favoriteToy = "Мячик";

        // Создаем экземпляр лабрадора
        Labrador lab1 = new Labrador("Рекс", "M", 0.5, 2, favoriteToy);

        // Выводим информацию о лабрадоре
        System.out.println(lab1);
        // Играем с новой игрушкой
        Object newToy = "Фрисби";
        lab1.guide(newToy);

    }
}

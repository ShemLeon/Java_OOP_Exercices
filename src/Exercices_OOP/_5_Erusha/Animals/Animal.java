package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Animal {
    protected String name;
    protected String gender;

    public Animal(String n, String g) {
        this.name = n;
        this.gender = g;
    }

    @Override
    public String toString() {
        return "name: "+name+ ", gender: "+gender;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Tvar", "M");
        System.out.println("Shalom!");
        System.out.println(a1);
        //
           }
}

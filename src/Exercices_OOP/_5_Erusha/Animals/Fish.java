package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Fish extends Animal {
    private double depth;
    public Fish(String name, String gender, double depth){
        super(name, gender);
        this.depth = depth;
    }
    @Override
    public String toString(){
        return super.toString()+ ", depth: "+depth;
    }

    private void swim(){
        System.out.println("Fish swim!");
    }

    public static void main(String[] args) {
        Fish f1 = new Fish("Mif", "M", 5);
        System.out.println(f1);
        f1.swim();
    }
}

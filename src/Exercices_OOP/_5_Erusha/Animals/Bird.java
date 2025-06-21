package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Bird extends Animal{
    private double height;

    public Bird(String name, String gender, double height){
        super(name, gender);
        this.height = height;
    }
    @Override
    public String toString(){
        return super.toString()+ ", height: "+height;
    }

    public static void main(String[] args) {
        Bird b1 = new Bird("sokol", "F", 0.5);
        System.out.println(b1);

    }
}

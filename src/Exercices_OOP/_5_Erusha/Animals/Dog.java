package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Dog extends Mammal{
    protected int bones;
    public Dog(String name, String gender, double milk, int bones) {
        super(name, gender, milk);
        this.bones =bones;
    }

    public void hideBones(int bonesToHide){
        System.out.println("Hide bones: "+bonesToHide);
    }
    @Override
    public String toString(){
        return super.toString()+", bones to eat: "+bones;
    }

    public static void main(String[] args) {
       Dog d1 = new Dog("Sobaka", "F", 1, 3);
       System.out.println(d1);
       d1.hideBones(2);
    }
}

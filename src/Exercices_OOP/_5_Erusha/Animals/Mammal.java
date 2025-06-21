package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Mammal extends Animal {
    protected double milk;
    public Mammal(String name, String gender, double milk) {
        super(name, gender);
        this.milk = milk;
    }
    public String getName(){
        return this.name;
    }

    public void nurseFrom(Mammal m){
        System.out.println("Nurse From "+m.getName());
    }
    public void nurseSomeOne(Mammal m){
        System.out.println("Nurse "+m.getName());
    }


    @Override
    public String toString() {
        return super.toString()+ ", milk: "+milk;
    }

    public static void main(String[] args) {
        Mammal m1 = new Mammal("delfin", "M", 1);
        Mammal m2 = new Mammal("akula", "M", 1);
        System.out.println(m1);
        m1.nurseFrom(m2);
        m1.nurseSomeOne(m2);
    }
}

package Exercices_OOP._5_Erusha.Animals;// import unit4.collectionsLib.Node;

public class Boxer extends Dog{
    protected Object guard;
    public Boxer(String name, String gender, double milk, int bonesToEat, Object somethingToGuard) {
        super(name, gender, milk, bonesToEat);
        this.guard = somethingToGuard;
    }

    public void guard(Object somethingToGuard){
        System.out.println(this.name +" guarded "+ somethingToGuard.toString());
    }

    @Override
    public String toString(){
        return super.toString()+", guarded this guy: "+guard.toString();
    }


    public static void main(String[] args) {
        // Создаем объект, который будет охраняться
        Object objectToGuard = "Ценная вещь";
        Boxer bx1= new Boxer("Boxer", "F", 1, 3, objectToGuard);
        System.out.println(bx1);
        Object somethingElseToGuard = "Дом";
        bx1.guard(somethingElseToGuard);
        bx1.hideBones(2);
    }
}

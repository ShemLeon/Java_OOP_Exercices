package Exercices_OOP._7_Abstract.Evg;
public abstract class ClassicToy extends Toy{
    protected int fillAmount;

    public ClassicToy(String name, double basePrice){
        super(name, basePrice);
        this.fillAmount=0;
    }

    public abstract void fill(int amountToFill);
    public String toString(){
        return super.toString();
    }
}

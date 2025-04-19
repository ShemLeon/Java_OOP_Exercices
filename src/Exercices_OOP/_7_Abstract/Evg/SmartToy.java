package Exercices_OOP._7_Abstract.Evg;
public abstract class SmartToy extends Toy{
    private boolean hasSound;
    private boolean hasLights;

    public SmartToy(String name, double basePrice,boolean hasSound,boolean hasLights){
        super(name,basePrice);
        this.hasSound=hasSound;
        this.hasLights=hasLights;
    }

    public abstract void activate();

    public String toString(){
        return super.toString();
    }
}

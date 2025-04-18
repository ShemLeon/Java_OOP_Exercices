package Exercices_OOP._7_Abstract.t6_ToyStore;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class RobotToy extends SmartToy{
    private int batteryLife;

    public RobotToy(String name, double basePrice, boolean hasSound, boolean hasLights, int batteryLife) {
        super(name, basePrice, hasSound, hasLights);
        this.batteryLife = batteryLife;
    }

    @Override
    public void activate() {
        System.out.println("Robot"+super.toString()+"activate on battery: "+this.batteryLife);
    }

    @Override
    public double computePrice() {
        return basePrice + ((batteryLife>10) ? 20 : 0);
    }

    @Override
    public void changeBasePrice(double percent) {
        super.changeBasePrice(percent);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        //
        System.out.println("Shalom!");
        //
    }
}

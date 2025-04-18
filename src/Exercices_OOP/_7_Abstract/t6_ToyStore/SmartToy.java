package Exercices_OOP._7_Abstract.t6_ToyStore;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public abstract class SmartToy extends Toy{
    protected boolean hasSound;
    protected boolean hasLights;

    public SmartToy(String name, double basePrice, boolean hasSound, boolean hasLights) {
        super(name, basePrice);
        this.hasSound = hasSound;
        this.hasLights = hasLights;
    }
    public abstract void activate();
}

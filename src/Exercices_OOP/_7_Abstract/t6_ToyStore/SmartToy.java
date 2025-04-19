package Exercices_OOP._7_Abstract.t6_ToyStore;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

/**
 * Abstract class representing a smart toy
 */
public abstract class SmartToy extends Toy{
    protected boolean hasSound;
    protected boolean hasLights;

    /**
     * Constructor for SmartToy
     * @param name the name of the toy
     * @param basePrice the base price
     * @param hasSound true if toy has sound
     * @param hasLights true if toy has lights
     */
    public SmartToy(String name, double basePrice, boolean hasSound, boolean hasLights) {
        super(name, basePrice);
        this.hasSound = hasSound;
        this.hasLights = hasLights;
    }

    /**
     * Abstract method to activate the smart toy
     */
    public abstract void activate();
}

package Exercices_OOP._7_Abstract.t6_ToyStore;

// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class RobotToy extends SmartToy{
    private int batteryLife;

    /**
     * Constructor for RobotToy
     * @param name the name of the robot
     * @param basePrice the base price
     * @param hasSound true if robot has sound
     * @param hasLights true if robot has lights
     * @param batteryLife battery life in hours
     */
    public RobotToy(String name, double basePrice, boolean hasSound, boolean hasLights, int batteryLife) {
        super(name, basePrice, hasSound, hasLights);
        this.batteryLife = batteryLife;
    }

    /**
     * Activates the robot
     */
    @Override
    public void activate() {
        System.out.println("Robot "+super.toString()+" activate on battery: "+this.batteryLife+ " hours");
    }

    /**
     * Calculates the final price of the robot
     * @return the price of the toy
     */
    @Override
    public double computePrice() {
        return basePrice + ((batteryLife>10) ? 20 : 0);
    }

    /**
     * Changes the base price by a given percent
     * @param percent the percent to change
     */
    @Override
    public void changeBasePrice(double percent) {
        super.changeBasePrice(percent);
    }

    /**
     * Returns a string representation of the robot
     * @return description of the robot
     */
    @Override
    public String toString() {
        return super.toString();
    }

}

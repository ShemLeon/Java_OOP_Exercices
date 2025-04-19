package Exercices_OOP._7_Abstract.Evg;
public class RobotToy extends SmartToy {
    private int batteryLife;

    public RobotToy(String name, double basePrice, boolean hasSound, boolean hasLights, int batteryLife) {
        super(name, basePrice, hasSound, hasLights);
        this.batteryLife = batteryLife;
    }

    public double computePrice(){
        if(this.batteryLife>10)
            return super.basePrice+20;
        else return super.basePrice;

    }
    public void activate(){
        System.out.println("Robot "+super.toString()+computePrice()+" activate on battery: "+this.batteryLife+" hours");
    }

    public String toString(){
        return super.toString()+computePrice();
    }
    /*
    Dolly1: the price is 160.0
    Dolly2: the price is 170.0
    Teddy1: the price is 110.0, color: Red, is big: true
    Teddy2: the price is 105.0, color: Blue, is big: false
    Robot1: the price is 220.0
    Robot2: the price is 250.0
    * */
}

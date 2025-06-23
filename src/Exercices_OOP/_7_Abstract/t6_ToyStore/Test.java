package Exercices_OOP._7_Abstract.t6_ToyStore;

public class Test {
    public static void main(String[] args) {
        Toy[] toys = new Toy[6];
        toys[0] = new Dolly("Dolly1", 100, 3, 20);
        toys[1] = new Dolly("Dolly2", 120, 2, 25);
        toys[2] = new TeddyBear("Teddy1", 80, "Red", true);
        toys[3] = new TeddyBear("Teddy2", 90, "Blue", false);
        toys[4] = new RobotToy("Robot1", 200, true, true, 15);
        toys[5] = new RobotToy("Robot2", 250, false, true, 8);
        for (int i=0; i<toys.length;i++)
            System.out.println(toys[i].toString());

        toys[1].changeBasePrice(50);
        System.out.println(toys[1].toString());
        System.out.println("Toy count: "+Toy.getToyCount());
        ((RobotToy)toys[5]).activate();

        Toy[] toys2 = new Toy[2];
        toys2[0] = new Dolly("Dolly1", 100, 3, 20);
        toys2[1] = new Dolly("Dolly2", 120, 2, 25);
        for (int i=0; i<toys2.length;i++)
            System.out.println(toys2[i].toString());
        System.out.println("Toy count: "+Toy.getToyCount());

        // Test 1: Testing TeddyBear filling functionality
        System.out.println("\nTeddyBear Filling Test:");
        TeddyBear bigBear = new TeddyBear("BigTeddy", 100, "Brown", true);
        System.out.println("Initial state: " + bigBear);
        bigBear.fill(50);
        System.out.println("After filling 50: " + bigBear);
        bigBear.fill(40); // Trying to exceed maximum
        System.out.println("After attempting to overfill: " + bigBear);

        // Test 2: Testing Robot activation
        System.out.println("\nRobot Functionality Test:");
        RobotToy smartRobot = new RobotToy("SmartBot", 300, true, false, 20);
        System.out.println("Initial state: " + smartRobot);
        smartRobot.activate();
        System.out.println("After activation: " + smartRobot);

        // Test 3: Testing price changes with different percentages
        System.out.println("\nPrice Change Test:");
        Dolly testDolly = new Dolly("TestDolly", 100, 2, 15);
        System.out.println("Initial price: " + testDolly.computePrice());
        testDolly.changeBasePrice(10); // increase by 10%
        System.out.println("After 10% increase: " + testDolly.computePrice());
        testDolly.changeBasePrice(-5); // decrease by 5%
        System.out.println("After 5% decrease: " + testDolly.computePrice());

        // Test 4: Testing edge cases
        System.out.println("\nEdge Cases Test:");
        RobotToy minPriceRobot = new RobotToy("MinBot", 0, false, true, 1);
        RobotToy maxPriceRobot = new RobotToy("MaxBot", 1000, true, true, 100);
        System.out.println("Robot with minimum price: " + minPriceRobot);
        System.out.println("Robot with maximum price: " + maxPriceRobot);

        // Test 5: Testing toy counter
        System.out.println("\nToy Counter Test:");
        System.out.println("Current toy count: " + Toy.getToyCount());

        // Test 6: Testing different battery life impacts on price
        System.out.println("\nBattery Life Impact Test:");
        RobotToy lowBatteryRobot = new RobotToy("LowBatBot", 100, true, true, 5);
        RobotToy highBatteryRobot = new RobotToy("HighBatBot", 100, true, true, 15);
        System.out.println("Low battery robot price: " + lowBatteryRobot.computePrice());
        System.out.println("High battery robot price: " + highBatteryRobot.computePrice());

        // Final statistics
        System.out.println("\n=== Final Statistics ===");
        System.out.println("Final toy count in store: " + Toy.getToyCount());
    }
}

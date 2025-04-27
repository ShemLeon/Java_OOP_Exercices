package Exercices_OOP._8_Interface.t1_Product;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Test {
    public static void main(String[] args) {
        // Creating an array of 10 products of different types
        PayAble[] products = new PayAble[10];
        products[0] = new Iron("Phillips", "Utyug007", 120, 25.5, true);
        products[1] = new Iron("Tefal", "Utyug006", 80, 18.9, false);
        products[2] = new TV("Samsung", "Almaz", 15, 1200, true);
        products[3] = new TV("LG", "Bereza", 25, 2500, true);
        products[4] = new TV("Sony", "Panas123", 30, 750, false);
        products[5] = new Micro("Samsung", "ME83X", 45, 120, 0.5);
        products[6] = new Micro("LG", "MS2336GIH", 60, 95, 0.4);
        products[7] = new DVD("Sony", "Pony13", 180, 249.99, "4K");
        products[8] = new DVD("LG", "BP250", 220, 69.99, "Full HD");
        products[9] = new DVD("Yamaha", "BD-S477", 150, 199.99, "3D");

        // Printing report on all products
        System.out.println("===== Product Report =====");
        double totalStock = 0;

        for (PayAble product : products) {
            product.printPrice();
            double stockValue = product.stock();
            System.out.println("Stock value: " + stockValue);
            System.out.println("Has discount: " + (product.discount() ? "Yes" : "No"));
            System.out.println("---------------------------------");

            totalStock += stockValue;
        }

        System.out.println("Total stock value: " + totalStock);
        System.out.println("===============================");

        // Checking if the iron is in inventory
        Iron newIron = new Iron("Phillips", "GC1433", 120, 25.5, true);
        boolean found = false;

        for (PayAble product : products) {
            if (product instanceof Iron && product.equals(newIron)) {
                found = true;
                System.out.println("This iron is already in inventory.");
                break;
            }
        }

        if (!found) {
            System.out.println("This iron is not in inventory.");
        }

    }
}

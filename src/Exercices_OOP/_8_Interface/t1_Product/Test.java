package Exercices_OOP._8_Interface.t1_Product;

import unit4.collectionsLib.Node;
// מגישים:
// יבגני נמצ'נקו 321404634
// שמיאקין לאוניד 336540331
// כיתה 48-5

public class Test {
    public static void main(String[] args) {
        // Создаем массив из 10 продуктов разных типов
        PayAble[] products = new PayAble[10];

        products[0] = new Iron("Phillips", "GC1433", 120, 25.5, true);
        products[1] = new Iron("Tefal", "FV1542", 80, 18.9, false);
        products[2] = new TV("Samsung", "UE43TU7097", 15, 1200, true);
        products[3] = new TV("LG", "OLED55C1", 25, 2500, true);
        products[4] = new TV("Sony", "KD-32W800", 30, 750, false);
        products[5] = new Micro("Samsung", "ME83X", 45, 120, 0.5);
        products[6] = new Micro("LG", "MS2336GIH", 60, 95, 0.4);
        products[7] = new DVD("Sony", "UBP-X800M2", 180, 249.99, "4K");
        products[8] = new DVD("LG", "BP250", 220, 69.99, "Full HD");
        products[9] = new DVD("Yamaha", "BD-S477", 150, 199.99, "3D");

        // Выводим отчет о всех продуктах
        System.out.println("===== Отчет о продуктах =====");
        double totalStock = 0;

        for (PayAble product : products) {
            product.printPrice();
            double stockValue = product.stock();
            System.out.println("Стоимость запасов: " + stockValue);
            System.out.println("Имеет скидку: " + (product.discount() ? "Да" : "Нет"));
            System.out.println("---------------------------------");

            totalStock += stockValue;
        }

        System.out.println("Общая стоимость запасов: " + totalStock);
        System.out.println("===============================");

        // Проверка наличия утюга в инвентаре
        Iron newIron = new Iron("Phillips", "GC1433", 120, 25.5, true);
        boolean found = false;

        for (PayAble product : products) {
            if (product instanceof Iron && product.equals(newIron)) {
                found = true;
                System.out.println("Утюг уже есть в инвентаре.");
                break;
            }
        }

        if (!found) {
            System.out.println("Этого утюга нет в инвентаре.");
        }

    }
}

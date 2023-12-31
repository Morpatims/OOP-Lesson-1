package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                if (product.getName().equals(name)) {
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }

}

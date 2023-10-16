package ru.geekbrains.lesson1;

public class Chocolate extends Product {
    private int calories;

    public Chocolate(String brand, String name, double price, int calories) {
        super(brand, name, price);
        setCalories(calories);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 0) {
            this.calories = 0;
        } else {
            this.calories = calories;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад]\n%s - %s - %.2f;\nКалории: %d",
                brand, name, price, calories);
    }
}
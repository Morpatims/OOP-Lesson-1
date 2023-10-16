package ru.geekbrains.lesson1;

public class BottleOfWater extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой]\n%s - %s - %.2f;\nОбъем: %.1f",
                brand, name, price, volume);
    }
}

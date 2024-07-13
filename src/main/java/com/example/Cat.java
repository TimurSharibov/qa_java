package com.example;

import java.util.List;

public class Cat {
    private final Feline feline;

    public Cat(Feline feline) {
        this.feline = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        List<String> food = feline.getFood("Хищник");
        System.out.println("Food list: " + food);  // Добавьте этот вывод для отладки
        return food;
    }
}

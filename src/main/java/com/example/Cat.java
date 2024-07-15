package com.example;

import java.util.List;

public class Cat {
    private final Feline feline; // создаем переменную для объекта класса Feline

    public Cat(Feline feline) {
        this.feline = feline; // конструктор класса Cat
    }

    public String getSound() {
        return "Мяу"; // возвращаем звук, издаваемый кошкой
    }

    public List<String> getFood() throws Exception {
        List<String> food = feline.getFood("Хищник"); // получаем список еды для кошки из класса Feline
        System.out.println("Food list: " + food);  // Добавьте этот вывод для отладки
        return food; // возвращаем список еды
    }
}

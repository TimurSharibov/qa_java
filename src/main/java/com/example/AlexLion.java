package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline); // вызываем конструктор родительского класса с указанием пола
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман"); // возвращаем список друзей
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк"; // возвращаем место жительства
    }

    @Override
    public int getKittens() {
        return 0; // возвращаем количество детенышей (для данного класса всегда 0)
    }
}

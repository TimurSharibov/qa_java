package com.example;

import java.util.List;

public class Feline {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Хищник");
        }
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public String getFamily() {
        return "Кошачьи";
    }
}

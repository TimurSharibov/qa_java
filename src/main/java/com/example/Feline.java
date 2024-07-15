package com.example;

import java.util.List;

public class Feline {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба"); // если тип животного хищник, возвращаем соответствующий список еды
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Хищник"); // выбрасываем исключение для нехищного типа животного
        }
    }

    public int getKittens() {
        return getKittens(1); // возвращаем количество котят
    }

    public int getKittens(int kittensCount) {
        return kittensCount; // возвращаем количество котят
    }

    public String getFamily() {
        return "Кошачьи"; // возвращаем информацию о семействе кошачьих
    }
}

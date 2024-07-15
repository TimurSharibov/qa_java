package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения"); // если тип животного травоядное, возвращаем соответствующий список еды
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба"); // если тип животного хищник, возвращаем соответствующий список еды
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник"); // выбрасываем исключение для неизвестного типа животного
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи"; // возвращаем информацию о семействах животных
    }
}

package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion(Feline feline) throws Exception {
        super("�����", feline);
    }

    public List<String> getFriends() {
        return List.of("�����", "������", "������");
    }

    public String getPlaceOfLiving() {
        return "���-�������� �������";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
package com.narxoz.rpg.hero;

public class Mage extends Hero {

    public Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public int attack() {
        return damage + 5; // магический бонус
    }
}
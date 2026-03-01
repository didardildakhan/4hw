package com.narxoz.rpg.battle;

public interface Combatant {
    String getName();
    int getHealth();
    int attack();
    void takeDamage(int damage);
    boolean isAlive();
}